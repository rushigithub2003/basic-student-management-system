package com.example.student.service;

import com.example.student.entity.Student;

public interface StudentService {
	
	public void addStudent(Student s);
	
	public Student getStudentById(int id);

}
