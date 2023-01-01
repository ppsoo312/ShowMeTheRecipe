package com.smtr.cookExplain;

public class CookExplainVO {
	private int stepNo; // 요리순서시퀀스
	private String content; // 요리설명
	private String stepImg; // 요리 이미지
	
	public CookExplainVO(int stepNo, String content, String stepImg) {
		this.stepNo = stepNo;
		this.content = content;
		this.stepImg = stepImg;
	}

	public int getStepNo() {
		return stepNo;
	}

	public void setStepNo(int stepNo) {
		this.stepNo = stepNo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStepImg() {
		return stepImg;
	}

	public void setStepImg(String stepImg) {
		this.stepImg = stepImg;
	}
}
