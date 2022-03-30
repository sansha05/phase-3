package com.microservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.entity.Student;
import com.microservice.repository.StudentRepo;

@Service
public class StudentServ {

	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		studentRepo.findAll().forEach(student -> students.add(student));
		return students;
	}
	
	public void addStudent(Student st) {
		studentRepo.save(st);
	}
	
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
	}
}
