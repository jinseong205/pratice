package com.jinseong.pratice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
	
	@GetMapping(path = "/test/hashing")
	public String hashing() {
		System.out.println("해슁");
		return "/test/hashing";
	}
	
}
