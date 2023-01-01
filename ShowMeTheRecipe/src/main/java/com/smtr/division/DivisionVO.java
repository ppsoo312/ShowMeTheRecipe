package com.smtr.division;

public class DivisionVO {
	private int divNo; // 분류시퀀스
	private int ganreNo; // 종류별시퀀스
	private int ingreNo; // 재료별시퀀스
	private int situNo; // 상황별시퀀스
	private int cookeryNo; // 조리별시퀀스
	
	public DivisionVO(int divNo, int ganreNo, int ingreNo, int situNo, int cookeryNo) {
		this.divNo = divNo;
		this.ganreNo = ganreNo;
		this.ingreNo = ingreNo;
		this.situNo = situNo;
		this.cookeryNo = cookeryNo;
	}

	public int getDivNo() {
		return divNo;
	}

	public void setDivNo(int divNo) {
		this.divNo = divNo;
	}

	public int getGanreNo() {
		return ganreNo;
	}

	public void setGanreNo(int ganreNo) {
		this.ganreNo = ganreNo;
	}

	public int getIngreNo() {
		return ingreNo;
	}

	public void setIngreNo(int ingreNo) {
		this.ingreNo = ingreNo;
	}

	public int getSituNo() {
		return situNo;
	}

	public void setSituNo(int situNo) {
		this.situNo = situNo;
	}

	public int getCookeryNo() {
		return cookeryNo;
	}

	public void setCookeryNo(int cookeryNo) {
		this.cookeryNo = cookeryNo;
	}
	
}
