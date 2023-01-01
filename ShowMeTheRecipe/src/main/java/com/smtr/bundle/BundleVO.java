package com.smtr.bundle;

public class BundleVO {
	private int bundleNo; // 재료묶음 시퀀스
	private String bundle; // 묶음명
	private int recipeNo; // 레시피 시퀀스
	
	public BundleVO() {
		
	}
	public BundleVO(int bundleNo, String bundle, int recipeNo) {
		this.bundleNo = bundleNo;
		this.bundle = bundle;
		this.recipeNo = recipeNo;
	}

	public int getBundleNo() {
		return bundleNo;
	}

	public void setBundleNo(int bundleNo) {
		this.bundleNo = bundleNo;
	}

	public String getBundle() {
		return bundle;
	}

	public void setBundle(String bundle) {
		this.bundle = bundle;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}
	
}
