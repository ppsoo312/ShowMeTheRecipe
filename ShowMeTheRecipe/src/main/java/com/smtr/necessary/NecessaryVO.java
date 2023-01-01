package com.smtr.necessary;

public class NecessaryVO {
	private int necessaryNo; // ��� ������
	private String necessary; // ����
	private int bundleNo; // ��ṭ�� ������
	private int recipeNo; // ������ ������
	
	public NecessaryVO(int necessaryNo, String necessary, int bundleNo, int recipeNo) {
		this.necessaryNo = necessaryNo;
		this.necessary = necessary;
		this.bundleNo = bundleNo;
		this.recipeNo = recipeNo;
	}

	public int getNecessaryNo() {
		return necessaryNo;
	}

	public void setNecessaryNo(int necessaryNo) {
		this.necessaryNo = necessaryNo;
	}

	public String getNecessary() {
		return necessary;
	}

	public void setNecessary(String necessary) {
		this.necessary = necessary;
	}

	public int getBundleNo() {
		return bundleNo;
	}

	public void setBundleNo(int bundleNo) {
		this.bundleNo = bundleNo;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}
	
}
