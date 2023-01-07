package com.smtr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smtr.division.DivisionService;
import com.smtr.recipe.RecipeService;

import common.ViewPath;

@Controller
public class SearchController {
		
		private RecipeService recipeService;
		private DivisionService divisionService;
		
		public SearchController(RecipeService recipeService, DivisionService divisionService) {
			this.recipeService=recipeService;
			this.divisionService=divisionService;
		}
		@RequestMapping("/search/searchMain")
		public String searchMain(HttpServletRequest request, HttpServletResponse response){
			
			List<String> ganreList = divisionService.ganreList();
			List<String> ingredientList = divisionService.ingredientList();
			List<String> situationList = divisionService.situationList();
			List<String> cookeryList = divisionService.cookeryList();
			
			System.out.println("ganreSize : " + ganreList.size());
			
			request.setAttribute("ganreList", ganreList);
			request.setAttribute("ingredientList", ingredientList);
			request.setAttribute("situationList", situationList);
			request.setAttribute("cookeryList", cookeryList);
			
			return ViewPath.SEARCH + "searchMain.jsp";
		}

	
}
