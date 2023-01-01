package com.smtr.fileGroup;

public class FileGroupVO {
	private int fileGroup; // 파일그룹 시퀀스
	private int recipeNo; // 레시피 시퀀스
	private int fileNo; // 사진첨부 시퀀스
	
	public FileGroupVO(int fileGroup, int recipeNo, int fileNo) {
		this.fileGroup = fileGroup;
		this.recipeNo = recipeNo;
		this.fileNo = fileNo;
	}

	public int getFileGroup() {
		return fileGroup;
	}

	public void setFileGroup(int fileGroup) {
		this.fileGroup = fileGroup;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	
	
}
