package com.smtr.cookExplain;

public class CookExplainVO {
	private int stepNo; // �丮����������
	private String content; // �丮����
	private String stepImg; 
	
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
