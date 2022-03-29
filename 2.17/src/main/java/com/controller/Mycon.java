package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycon {

	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "home page";
	}
}
