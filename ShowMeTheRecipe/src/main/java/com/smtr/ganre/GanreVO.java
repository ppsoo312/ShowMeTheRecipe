package com.smtr.ganre;

public class GanreVO {
	private int ganreNo; // 종류별 시퀀스
	private String ganre; // 종류별 이름
	
	public GanreVO() {
		
	}
	
	public GanreVO(int ganreNo, String ganre) {
		this.ganreNo = ganreNo;
		this.ganre = ganre;
	}

	public int getGanreNo() {
		return ganreNo;
	}

	public void setGanreNo(int ganreNo) {
		this.ganreNo = ganreNo;
	}

	public String getGanre() {
		return ganre;
	}

	public void setGanre(String ganre) {
		this.ganre = ganre;
	}
	
	
}
