package com.smtr.cookStep;

public class CookStep {
	private int stepNo; // 요리순서 시퀀스
	private int recipeNo; // 레시피 시퀀스
	
	public CookStep() {
		
	}
	public CookStep(int stepNo, int recipeNo) {
		this.stepNo = stepNo;
		this.recipeNo = recipeNo;
	}

	public int getStepNo() {
		return stepNo;
	}

	public void setStepNo(int stepNo) {
		this.stepNo = stepNo;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}
	
	
	
}
