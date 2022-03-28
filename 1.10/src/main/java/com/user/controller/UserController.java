package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.user.entity.Users;
import com.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String userForm() {
		return "home";
	}
	
	@PostMapping("/getuser")
	public String getUser(@RequestParam("id") int id, Model model) {
		Users user = userService.getUser(id);
		model.addAttribute("user", user);
		return "user";
	}
	
	@GetMapping("/toupdate")
	public String updateUser() {
		return "toupdate";
	}
	
	@PostMapping("/updated")
	public String updated(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("age") int age, Model model) {
		Users us = new Users();
		us.setFirstname(firstname);
		us.setLastname(lastname);
		us.setAge(age);
		Users user = userService.saveUser(us);
		model.addAttribute("user", user);
		return "updated";
	}
	
	
}
