package com.smtr.situational;

public class SituationalVO {
	private int situNo; // 상황별 시퀀스
	private String situation; // 상황별 이름
	
	public SituationalVO(int situNo, String situation) {
		this.situNo = situNo;
		this.situation = situation;
	}
}
