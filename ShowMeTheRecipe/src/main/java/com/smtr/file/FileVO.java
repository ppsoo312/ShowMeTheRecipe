package com.smtr.file;

import java.sql.Date;

public class FileVO {
	private int fileNo; // ����÷�� ������
	private String originFile; // �������ϸ�
	private String serverName; // �����̸�
	private String serverPath; // �����ּ�
	private String extension; // Ȯ����
	private int size; // ����ũ��
	private Date registDate; // ���ε� �ð�
	
	public FileVO(int fileNo, String originFile, String serverName,
			String serverPath, String extension, int size, Date registDate) {
		this.fileNo = fileNo;
		this.originFile = originFile;
		this.serverName = serverName;
		this.serverPath = serverPath;
		this.extension = extension;
		this.size = size;
		this.registDate = registDate;
	}

	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public String getOriginFile() {
		return originFile;
	}

	public void setOriginFile(String originFile) {
		this.originFile = originFile;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerPath() {
		return serverPath;
	}

	public void setServerPath(String serverPath) {
		this.serverPath = serverPath;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	
}
