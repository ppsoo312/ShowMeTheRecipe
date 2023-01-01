package com.smtr.bundle;

public class BundleVO {
	private int bundleNo; // 배고파
	private String bundle; // 김치전 먹으면
	private int recipeNo; // 살찐다
	
	public BundleVO(int bundleNo, String bundle, int recipeNo) {
		this.bundleNo = bundleNo;
		this.bundle = bundle;
		this.recipeNo = recipeNo;
	}
}
