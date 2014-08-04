package com.chime.algo;

import java.util.StringTokenizer;

public class StringUtil1 {

	public String transSpaceNbsp(String str) {
		String delimeter = " ";
		String replace = " ";
		StringBuffer buffer = new StringBuffer();
		StringTokenizer stringT = new StringTokenizer(str, delimeter, true);
		String temp = null;

		int count = 0;
		while (stringT.hasMoreTokens()) {
			temp = stringT.nextToken();
			if (temp.equals(delimeter)) {
				count++;
			} else {
				if (count != 0) {
					if (count == 1) {
						buffer.append(" ");
					} else {
						for (int i = 0; i < count; i++)
							buffer.append(replace);
					}
				}
				buffer.append(temp);
				count = 0;
			}
		}
		if (count != 0) {
			for (int i = 0; i < count; i++)
				buffer.append(replace);
		}
		return buffer.toString();
	}

}
