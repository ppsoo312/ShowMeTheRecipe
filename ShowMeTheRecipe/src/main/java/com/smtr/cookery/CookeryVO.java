package com.smtr.cookery;

public class CookeryVO {
	private int cookeryNo; // 방법별 시퀀스
	private String cookery; // 방법별 이름쓰기
	
	public CookeryVO() {
		
	}
	public CookeryVO(int cookeryNo, String cookery) {
		this.cookeryNo = cookeryNo;
		this.cookery = cookery;
	}

	public int getCookeryNo() {
		return cookeryNo;
	}

	public void setCookeryNo(int cookeryNo) {
		this.cookeryNo = cookeryNo;
	}

	public String getCookery() {
		return cookery;
	}

	public void setCookery(String cookery) {
		this.cookery = cookery;
	}
	
	
}
