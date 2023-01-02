package com.smtr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import common.ViewPath;

@Controller
public class SearchController {

		@RequestMapping("/search/searchMain")
		public String searchMain(HttpServletRequest request, HttpServletResponse response){
			System.out.println("이거 안뜹니까 ???");
			return ViewPath.SEARCH + "searchMain.jsp";
		}

	
}
