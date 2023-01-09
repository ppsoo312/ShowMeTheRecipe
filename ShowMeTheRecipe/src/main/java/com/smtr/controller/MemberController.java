package com.smtr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import common.ViewPath;

@Controller
public class MemberController {
	
	@RequestMapping("member/joinForm")
	public String joinForm() {
		
		return ViewPath.MEMBER + "join.jsp";
	}
	
	@RequestMapping("member/join")
	public String joinCheck() {
		
		return ViewPath.LOGIN + "loginForm.jsp";
	}
	
//	@RequestMapping(value ="/member/checkEmail")
//	@ResponseBody
//	public String checkEmail(String email) {
//		
//		if(memberService.checkEmail(email) != null) {
//			return "이미 사용중인 Email입니다";
//		}else {
//			return "사용 가능한 Email입니다";
//		}
//	}
}
