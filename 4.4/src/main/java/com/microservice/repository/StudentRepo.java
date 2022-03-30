package com.microservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{
	

}
