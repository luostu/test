package com.oppein.cio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
	@RequestMapping("/hello")
	public String abc (@RequestParam String name) {
		return "哈哈。。有学习到了。回去多加了解 "+name;
	}

}
