package com.smtr.admin;

public class AdminVO {
	private int adminNo; // 관리자 시퀀스
	private String adminDept; // 관리부서명
	private int memNo; // 회원 시퀀스 - 관리자계정
	
	public AdminVO() {
		
	}
	
	public AdminVO(int adminNo, String adminDept, int memNo) {
		this.adminNo = adminNo;
		this.adminDept = adminDept;
		this.memNo = memNo;
	}

	public int getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}

	public String getAdminDept() {
		return adminDept;
	}

	public void setAdminDept(String adminDept) {
		this.adminDept = adminDept;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
}
