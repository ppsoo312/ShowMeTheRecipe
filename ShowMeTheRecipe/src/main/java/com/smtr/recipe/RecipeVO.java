package com.smtr.recipe;

import java.sql.Date;

public class RecipeVO {
	private int recipeNo;
	private int cooker; // 작성자 memNo
	private String title; // 제목
	private String intro; // 소개
	private String movieLink; // 영상링크
	private int divNo; // 분류 시퀀스
	private String level; // 난이도
	private String time; // 조리시간
	private String quantity; // 요리량
	private int hit; // 조회수
	private Date date; // 등록 날짜
	private int scrapCnt; // 스크랩수
	private String mainImg; // 썸네일
	
	public RecipeVO(int recipeNo, int cooker, String title, String intro, String movieLink, int divNo, String level,
			String time, String quantity, int hit, Date date, int scrapCnt, String mainImg) {
		this.recipeNo = recipeNo;
		this.cooker = cooker;
		this.title = title;
		this.intro = intro;
		this.movieLink = movieLink;
		this.divNo = divNo;
		this.level = level;
		this.time = time;
		this.quantity = quantity;
		this.hit = hit;
		this.date = date;
		this.scrapCnt = scrapCnt;
		this.mainImg = mainImg;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public int getCooker() {
		return cooker;
	}

	public void setCooker(int cooker) {
		this.cooker = cooker;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getMovieLink() {
		return movieLink;
	}

	public void setMovieLink(String movieLink) {
		this.movieLink = movieLink;
	}

	public int getDivNo() {
		return divNo;
	}

	public void setDivNo(int divNo) {
		this.divNo = divNo;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getScrapCnt() {
		return scrapCnt;
	}

	public void setScrapCnt(int scrapCnt) {
		this.scrapCnt = scrapCnt;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
	
}
