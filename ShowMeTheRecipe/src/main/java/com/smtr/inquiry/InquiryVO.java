package com.smtr.inquiry;

public class InquiryVO {
	private int inquiryNo; // 문의 시퀀스
	private String inqTitle; // 제목
	private String inqContent; // 질문
	private String inqAnswer; // 답변
	private int inqStatus; // 답변 전/후 상태 - 0:전, 1:후
	private int memNo; // 회원 시퀀스
	
	public InquiryVO() {
		
	}
	
	public InquiryVO(int inquiryNo, String inqTitle, String inqContent,
			String inqAnswer, int inqStatus, int memNo) {
		this.inquiryNo = inquiryNo;
		this.inqTitle = inqTitle;
		this.inqContent = inqContent;
		this.inqAnswer = inqAnswer;
		this.inqStatus = inqStatus;
		this.memNo = memNo;
	}

	public int getInquiryNo() {
		return inquiryNo;
	}

	public void setInquiryNo(int inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	public String getInqTitle() {
		return inqTitle;
	}

	public void setInqTitle(String inqTitle) {
		this.inqTitle = inqTitle;
	}

	public String getInqContent() {
		return inqContent;
	}

	public void setInqContent(String inqContent) {
		this.inqContent = inqContent;
	}

	public String getInqAnswer() {
		return inqAnswer;
	}

	public void setInqAnswer(String inqAnswer) {
		this.inqAnswer = inqAnswer;
	}

	public int getInqStatus() {
		return inqStatus;
	}

	public void setInqStatus(int inqStatus) {
		this.inqStatus = inqStatus;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
	
}
