package com.smtr.scrap;

public class ScrapVO {
	private int scrapNo; // ��ũ��������
	private int recipeNo; // �����ǽ�����
	private int folderNo; // ��ũ������ ������
	private int memNo; // ȸ��������
	
	public ScrapVO(int scrapNo, int recipeNo, int folderNo, int memNo) {
		this.scrapNo = scrapNo;
		this.recipeNo = recipeNo;
		this.folderNo = folderNo;
		this.memNo = memNo;
	}

	public int getScrapNo() {
		return scrapNo;
	}

	public void setScrapNo(int scrapNo) {
		this.scrapNo = scrapNo;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public int getFolderNo() {
		return folderNo;
	}

	public void setFolderNo(int folderNo) {
		this.folderNo = folderNo;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
}
