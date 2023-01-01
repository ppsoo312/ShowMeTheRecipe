package com.smtr.bundle;

public class BundleVO {
	private int bundleNo; // Àç·á¹­À½ ½ÃÄö½º
	private String bundle; // ¹­À½¸í
	private int recipeNo; // ·¹½ÃÇÇ ½ÃÄö½º
	
	public BundleVO(int bundleNo, String bundle, int recipeNo) {
		this.bundleNo = bundleNo;
		this.bundle = bundle;
		this.recipeNo = recipeNo;
	}
}
