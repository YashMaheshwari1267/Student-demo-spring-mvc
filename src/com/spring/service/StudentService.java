package com.spring.service;

import java.util.List;

import com.spring.model.Student;

public interface StudentService {
	public void insertStudent(Student student);
	
	public List<Student> searchAll();
	
	public void deleteStudent(int studId);
	
	public Student searchStudent(int studId);
	
	public void updateStudent(Student s);
	
	public List<Student> sortList(String sortBy);
}