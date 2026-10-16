package com.example.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public void addStudent(Student s)
	{
		sr.save(s);
	}
	
	public Student getStudentById(int id)
	{
		return sr.findById(id).get();
	}
	
	public void deleteStudentById(int id)
	{
		sr.deleteById(id);
	}
	
	public void deleteAllStudent()
	{
		sr.deleteAll();
	}

}
