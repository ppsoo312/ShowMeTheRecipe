package com.smtr.fileGroup;

public class FileGroupVO {
	private int fileGroup; // ���ϱ׷� ������
	private int recipeNo; // ������ ������
	private int fileNo; // ����÷�� ������
	
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
