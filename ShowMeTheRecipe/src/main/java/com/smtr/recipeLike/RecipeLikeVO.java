package com.smtr.recipeLike;

public class RecipeLikeVO {
	private int recipeLike; // 레시피 좋아요 여부 -> 좋아요 누르면 1로 insert
	private int recipeNo; // 레시피 시퀀스
	private int pressMemNo; // 좋아요 누른 회원 시퀀스
	
	public RecipeLikeVO() {
		
	}
	
	public RecipeLikeVO(int recipeLike, int recipeNo, int pressMemNo) {
		this.recipeLike = recipeLike;
		this.recipeNo = recipeNo;
		this.pressMemNo = pressMemNo;
	}

	public int getRecipeLike() {
		return recipeLike;
	}

	public void setRecipeLike(int recipeLike) {
		this.recipeLike = recipeLike;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public int getPressMemNo() {
		return pressMemNo;
	}

	public void setPressMemNo(int pressMemNo) {
		this.pressMemNo = pressMemNo;
	}
	
}
