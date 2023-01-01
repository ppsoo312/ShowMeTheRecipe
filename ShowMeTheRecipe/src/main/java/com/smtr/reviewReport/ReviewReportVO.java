package com.smtr.reviewReport;

public class ReviewReportVO {
	private int rvReportNo; // 리뷰 신고 시퀀스
	private int memNo; // 신고자 - 누가 신고했는지
	private int reviewNo; // 리뷰 시퀀스
	private int reportNo; // 신고 시퀀스
	
	public ReviewReportVO() {
		
	}
	
	public ReviewReportVO(int rvReportNo, int memNo, int reviewNo, int reportNo) {
		this.rvReportNo = rvReportNo;
		this.memNo = memNo;
		this.reviewNo = reviewNo;
		this.reportNo = reportNo;
	}

	public int getRvReportNo() {
		return rvReportNo;
	}

	public void setRvReportNo(int rvReportNo) {
		this.rvReportNo = rvReportNo;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}
	
}
