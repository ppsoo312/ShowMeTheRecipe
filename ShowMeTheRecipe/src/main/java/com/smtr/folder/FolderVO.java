package com.smtr.folder;

public class FolderVO {
	private int folderNo; // 주석 다 깨짐 
	private String folderName; // ��ũ�������̸�
	
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
