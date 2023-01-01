package com.smtr.review;

import java.sql.Date;

public class Review {
	private int reviewNo; // 리뷰 시퀀스
	private int recipeNo; // 레시피 시퀀스
	private int rvWriter; // 리뷰 작성자 -> 리뷰 쓴 회원 시퀀스
	private String rvContent; // 리뷰 내용
	private float score; // 평점
	private String filePath; // 파일첨부 경로
	private Date rvDate; // 작성일
	
	public Review() {
		
	}
	public Review(int reviewNo, int recipeNo, int rvWriter, String rvContent,
			float score, String filePath, Date rvDate) {
		this.reviewNo = reviewNo;
		this.recipeNo = recipeNo;
		this.rvWriter = rvWriter;
		this.rvContent = rvContent;
		this.score = score;
		this.filePath = filePath;
		this.rvDate = rvDate;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public int getRvWriter() {
		return rvWriter;
	}

	public void setRvWriter(int rvWriter) {
		this.rvWriter = rvWriter;
	}

	public String getRvContent() {
		return rvContent;
	}

	public void setRvContent(String rvContent) {
		this.rvContent = rvContent;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Date getRvDate() {
		return rvDate;
	}

	public void setRvDate(Date rvDate) {
		this.rvDate = rvDate;
	}
	
}
