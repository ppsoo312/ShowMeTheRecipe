package com.smtr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import common.ViewPath;

@Controller
public class LoginController {
	
	
	@RequestMapping("/login/login")
	public String login() {
		return ViewPath.LOGIN + "loginForm.jsp";
	}
	
	@RequestMapping("login/check")
	public String check(HttpServletRequest request) {
		
		int loginKind = Integer.parseInt(request.getParameter("loginKind"));
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(loginKind == 2) {
			
		}
		
		return ViewPath.MAIN + "index.jsp";
	}
	
}
