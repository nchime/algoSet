package com.chime.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpConnectionHelper {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String url;

	private String requestMethod = "GET";

	private HttpURLConnection con;

	private Map<String, String> paramMap;

	public HttpConnectionHelper(String url) {
		this.url = url;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public void addParameter(String key, String value) {
		if (paramMap == null) {
			paramMap = new HashMap<String, String>();
		}
		paramMap.put(key, value);
	}

	public void openConnection() throws IOException {
		String connUrl = url;
		if ("GET".equals(requestMethod)) {
			connUrl += ("?" + getParameterString());
		}

		logger.debug("Connecting to {}", connUrl);

		con = (HttpURLConnection) new URL(connUrl).openConnection();
		con.setRequestMethod(requestMethod);
		con.setDoOutput(true);
		con.setUseCaches(false);
		con.setConnectTimeout(10000);
		con.setReadTimeout(10000);

		if ("POST".equals(requestMethod)) {
			writeAndFlush(getParameterString());
		}
	}

	public String getParameterString() throws UnsupportedEncodingException {
		if (paramMap == null) {
			return "";
		} else {
			StringBuilder paramStr = new StringBuilder();
			for (String key : paramMap.keySet()) {
				String value = paramMap.get(key);
				paramStr.append(URLEncoder.encode(key, "UTF-8"));
				paramStr.append("=");
				if (value != null) {
					paramStr.append(URLEncoder.encode(value, "UTF-8"));
				}
				paramStr.append("&");
			}
			if (paramStr.length() == 0) {
				return "";
			}
			return paramStr.substring(0, paramStr.length() - 1);
		}
	}

	public void writeAndFlush(String string) throws IOException {
		Writer writer = new OutputStreamWriter(con.getOutputStream());
		writer.write(string);
		writer.flush();
	}

	public boolean hasError() throws IOException {
		return (con.getResponseCode() != 200 && con.getResponseCode() != 201);
	}

	public int getResponseCode() throws IOException {
		return con.getResponseCode();
	}

	public String getResponseMessage() throws IOException {
		return con.getResponseMessage();
	}

	public String getBodyContent() throws IOException {
		String bodyContent = null;
		try {
			InputStream in = null;
			if (hasError()) {
				in = con.getErrorStream();
			} else {
				in = con.getInputStream();
			}
			if (in == null) {
				return "";
			}

			// InputStream
			BufferedReader rd = new BufferedReader(new InputStreamReader(in,
					"UTF-8"));

			String line = null;
			while ((line = rd.readLine()) != null) {
				if (bodyContent == null)
					bodyContent = line;
				else
					bodyContent += line;
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		}

		return bodyContent;
	}

	public void close() {
		if (con != null) {
			con.disconnect();
		}

	}

	public void assertResponse() throws IOException {
		if (hasError()) {
			logger.error("{} {}\n{}", new Object[] { getResponseCode(),
					getResponseMessage(), getBodyContent() });
			throw new IOException(getResponseCode() + " "
					+ getResponseMessage());
		}
	}

}
