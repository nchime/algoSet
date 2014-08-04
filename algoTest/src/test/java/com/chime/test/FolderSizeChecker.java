package com.chime.test;

import java.io.File;
import java.text.DecimalFormat;

public class FolderSizeChecker {

	// Member Variables
	private long dFolderSize;
	private long NG = -1;

	// Constructor
	public FolderSizeChecker() {
		dFolderSize = 0;
	}

	// calculate folder size
	private void calcSize(File tFolder) {
		File[] fList = tFolder.listFiles();
		for (int i = 0; i < fList.length; i++) {
			if (fList[i].isFile()) {
				dFolderSize += fList[i].length();
			} else {
				calcSize(fList[i]);
			}
		}
	}

	// return folder size
	public long getFolderSize(String fPath) {
		long retVal;
		File tFolder = new File(fPath);
		if (tFolder.exists() && tFolder.isDirectory()) {
			calcSize(tFolder);
			retVal = dFolderSize;
		} else {
			retVal = NG;
		}
		return retVal;
	}
	
	
	public String readableFileSize(long size) {
	    if(size <= 0) return "0";
	    final String[] units = new String[] { "B", "KB", "MB", "GB", "TB" };
	    int digitGroups = (int) (Math.log10(size)/Math.log10(1024));
	    return new DecimalFormat("#,##0.#").format(size/Math.pow(1024, digitGroups)) + " " + units[digitGroups];
	}

	
	
	
}
