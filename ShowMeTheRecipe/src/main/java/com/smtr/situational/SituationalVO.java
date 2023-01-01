package com.smtr.situational;

public class SituationalVO {
	private int situNo; // 상황별 시퀀스
	private String situation; // 상황별 이름
	
	public SituationalVO() {
		
	}
	
	public SituationalVO(int situNo, String situation) {
		this.situNo = situNo;
		this.situation = situation;
	}

	public int getSituNo() {
		return situNo;
	}

	public void setSituNo(int situNo) {
		this.situNo = situNo;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}
	
}
