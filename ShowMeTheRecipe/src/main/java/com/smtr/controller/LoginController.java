package com.smtr.controller;

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
	
}
