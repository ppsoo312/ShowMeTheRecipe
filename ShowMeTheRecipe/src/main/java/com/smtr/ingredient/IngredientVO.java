package com.smtr.ingredient;

public class IngredientVO {
	private int ingredientNo; //재료별 시퀀스
	private String ingredient; //재료별 이름
	
	
	public IngredientVO() {
		
	}
	
	public IngredientVO(int ingredientNo, String ingredient) {
		this.ingredientNo = ingredientNo;
		this.ingredient = ingredient;
	}

	public int getIngredientNo() {
		return ingredientNo;
	}
	public void setIngredientNo(int ingredientNo) {
		this.ingredientNo = ingredientNo;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	
}
