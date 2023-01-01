package com.smtr.review;

import java.sql.Date;

public class Review {
	private int reviewNo; // ���� ������
	private int recipeNo; // ������ ������
	private int rvWriter; // ���� �ۼ��� memNo�ǹ�
	private String rvContent; // ���� ����
	private int score; // ����
	private String filePath; // ����÷��
	private Date rvDate; // �ۼ���
	
	public Review(int reviewNo, int recipeNo, int rvWriter, String rvContent,
			int score, String filePath, Date rvDate) {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
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
