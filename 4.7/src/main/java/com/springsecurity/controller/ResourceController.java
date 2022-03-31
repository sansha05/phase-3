package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@GetMapping("/")
	public String gethome() {
		return "home page";
	}
	
	@GetMapping("/user")
	public String getName() {
		return "hello user";
	}
	
	@GetMapping("/admin") 
	public String getAdmin() {
		return "hello admin";
		
	}

}
