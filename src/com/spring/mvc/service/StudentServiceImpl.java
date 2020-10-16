package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.dao.StudentDAOImpl;
import com.spring.mvc.model.Student;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAOImpl sd;
	
	@Override
	public void insertStudent(Student s) {
		sd.insertStudent(s);
	}

	@Override
	public List<Student> viewAll() {
		return sd.viewAll();
	}

}
