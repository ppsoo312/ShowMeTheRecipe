package com.smtr.division;

public class DivisionVO { // 아니 내 프로젝트에서도 다 주석깨져서 보이네
	private int divNo; // �з�������
	private int ganreNo; // ������������
	private int ingreNo; // ��Ằ������
	private int situNo; // ��Ȳ��������
	private int cookeryNo; // ������������
	
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
