package com.smtr.scrap;

public class ScrapVO {
	private int scrapNo; // 스크랩 시퀀스
	private int recipeNo; // 레시피 시퀀스
	private int folderNo; // 스크랩폴더 시퀀스
	private int memNo; // 회원시퀀스 - 폴더 주인
	
	public ScrapVO() {
		
	}
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
