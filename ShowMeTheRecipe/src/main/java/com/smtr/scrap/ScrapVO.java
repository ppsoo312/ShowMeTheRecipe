package com.smtr.scrap;

public class ScrapVO {
	private int scrapNo; // ½ºÅ©·¦½ÃÄö½º
	private int recipeNo; // ·¹½ÃÇÇ½ÃÄö½º
	private int folderNo; // ½ºÅ©·¦Æú´õ ½ÃÄö½º
	private int memNo; // È¸¿ø½ÃÄö½º
	
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
