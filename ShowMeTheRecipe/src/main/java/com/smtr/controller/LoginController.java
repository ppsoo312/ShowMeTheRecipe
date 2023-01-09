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
		
		//id로 사용할 email
		String email = null;
		String password = null;
		String nickName = null;
		String photoPath = null;
		
		if(loginKind == 1) {
			email = request.getParameter("emailK");
			nickName = request.getParameter("nickNameK");
			photoPath = request.getParameter("photoPath");
		}
		
		
		return ViewPath.MAIN + "index.jsp";
	}
	
}
