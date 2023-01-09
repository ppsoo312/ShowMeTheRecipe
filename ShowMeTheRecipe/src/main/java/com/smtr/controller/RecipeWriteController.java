package com.smtr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smtr.recipe.RecipeService;

import common.ViewPath;

@Controller
public class RecipeWriteController {
	
	private RecipeService recipeService;
	
	public RecipeWriteController(RecipeService recipeService) {
		this.recipeService=recipeService;
	}
	
	@RequestMapping("/recipeWrite/form")
	public String recipeForm() {
		return ViewPath.RECIPEWRITE + "form.jsp";
	}
	
}
