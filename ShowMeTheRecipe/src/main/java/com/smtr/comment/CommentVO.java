package com.smtr.comment;

import java.sql.Date;

public class CommentVO {
	private int commNo; // 댓글 시퀀스
	private int memNo; // 회원 시퀀스
	private int recipeNo; // 레시피 시퀀스
	private Date commDate; // 댓글 시간
	private String commContent; // 댓글 내용
	
	public CommentVO() {
		
	}
	
	public CommentVO(int commNo, int memNo, int recipeNo,
			Date commDate, String commContent) {
		
		this.commNo = commNo;
		this.memNo = memNo;
		this.recipeNo = recipeNo;
		this.commDate = commDate;
		this.commContent = commContent;
	}

	public int getCommNo() {
		return commNo;
	}

	public void setCommNo(int commNo) {
		this.commNo = commNo;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public Date getCommDate() {
		return commDate;
	}

	public void setCommDate(Date commDate) {
		this.commDate = commDate;
	}

	public String getCommContent() {
		return commContent;
	}

	public void setCommContent(String commContent) {
		this.commContent = commContent;
	}
	
}
