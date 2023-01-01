package com.smtr.folder;

public class FolderVO {
	private int folderNo; // 스크랩 폴더 시퀀스
	private String folderName; // 스크랩 폴더명
	
	public FolderVO() {
		
	}
	public FolderVO(int folderNo, String folderName) {
		this.folderNo = folderNo;
		this.folderName = folderName;
	}

	public int getFolderNo() {
		return folderNo;
	}

	public void setFolderNo(int folderNo) {
		this.folderNo = folderNo;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	
}
