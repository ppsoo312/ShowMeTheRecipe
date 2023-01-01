package com.smtr.report;

public class ReportVO {
	private int reportNo; // 신고 시퀀스
	private String reportReason; // 신고 사유 - 라디오버튼 : 신고 내용
	
	public ReportVO() {
		
	}
	
	public ReportVO(int reportNo, String reportReason) {
		this.reportNo = reportNo;
		this.reportReason = reportReason;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public String getReportReason() {
		return reportReason;
	}

	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}
	
}
