package com.spring.dao;

import java.util.List;

import com.spring.model.Student;

public interface StudentDAO {
	public void insertStudent(Student s);
	
	public List<Student> searchAll();
	
	public void deleteStudent(int studId);
	
	public Student searchStudent(int studId);
	
	public void updateStudent(Student s);
}