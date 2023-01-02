package com.smtr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smtr.recipe.RecipeService;

import common.ViewPath;

@Controller
public class SearchController {
		
		private RecipeService recipeService;
		
		public SearchController(RecipeService recipeService) {
			this.recipeService=recipeService;
		}
		@RequestMapping("/search/searchMain")
		public String searchMain(HttpServletRequest request, HttpServletResponse response){
			
			List<String> ganreList = recipeService.ganreList();
			
			System.out.println(ganreList.size());
			
			request.setAttribute("ganreList", ganreList);
			
			return ViewPath.SEARCH + "searchMain.jsp";
		}

	
}
