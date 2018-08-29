package com.oppein.cio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String def() {
		return "login.html";	
	}
	@ResponseBody
	@RequestMapping("/validationUser")
	public String abc (@RequestParam String name,@RequestParam String password) {
		if(name.equals("user1")&&password.equals("123456")) {
		return "success" ;
	}else {
		return "false";
	}
	
	}

}
