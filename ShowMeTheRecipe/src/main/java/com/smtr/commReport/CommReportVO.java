package com.smtr.commReport;

public class CommReportVO {
	private int commReportNo; // 댓글 신고 시퀀스
	private int memNo; // 신고자 - 누가 신고했는지
	private int commNo; // 댓글 시퀀스
	private int reportNo; // 신고 시퀀스
	
	public CommReportVO() {
		
	}
	
	public CommReportVO(int commReportNo, int memNo,
			int commNo, int reportNo) {
		this.commReportNo = commReportNo;
		this.memNo = memNo;
		this.commNo = commNo;
		this.reportNo = reportNo;
	}

	public int getCommReportNo() {
		return commReportNo;
	}

	public void setCommReportNo(int commReportNo) {
		this.commReportNo = commReportNo;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public int getCommNo() {
		return commNo;
	}

	public void setCommNo(int commNo) {
		this.commNo = commNo;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}
	
}
