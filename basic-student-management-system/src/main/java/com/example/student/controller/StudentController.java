package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("student")
	String addStudent(@RequestBody Student s)
	{
		ss.addStudent(s);
		return "Student Added.";
	}
	
	@GetMapping("student/{id}")
	Student getStudentById(@PathVariable int id)
	{
		return ss.getStudentById(id);
	}
	
	@DeleteMapping("student/{id}")
	String deleteStudentById(@PathVariable int id)
	{
		ss.deleteStudentById(id);
		return "Student Deleted";
	}
	
	@DeleteMapping("student")
	String deleteAllStudent()
	{
		ss.deleteAllStudent();
		return "All Student Deleted";
	}

}
