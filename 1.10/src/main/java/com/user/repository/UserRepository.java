package com.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
	
	
}
