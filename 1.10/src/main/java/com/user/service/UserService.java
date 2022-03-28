package com.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Users;
import com.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public Users getUser(int id) {
		
		Optional<Users> optional = userRepository.findById(id);
		Users user= optional.get(); 
		return user;
	}
	
	public Users saveUser(Users u) {
		Users u1 = userRepository.save(u);
		return u1;
	}
	
//	public void saveUser() {
//		Users user = new Users();
//		user.setFistName("sandeep");
//		user.setLastName("sharma");
//		user.setAge(22);
//		
//		Users us = userRepository.save(user);
//	}

}
