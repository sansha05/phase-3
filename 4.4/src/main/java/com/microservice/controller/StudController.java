package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entity.Student;
import com.microservice.service.StudentServ;

@RestController
@RequestMapping(path="/student")
public class StudController {
	
	@Autowired
	StudentServ studentServ;
	
	@RequestMapping("/getstudents")
	public List<Student> getStudents() {
		return studentServ.getAllStudent();
	}
	
	@RequestMapping(value="/addstudent", method=RequestMethod.POST)
	public String addStudent(Student student) {
		studentServ.addStudent(student);
		return "student added";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") int id) {
		
		studentServ.deleteStudent(id);
		return "student deleted";
	}
	

}
