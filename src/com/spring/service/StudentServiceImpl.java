package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.StudentDAOImpl;
import com.spring.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAOImpl studentDAOImpl;
	
	@Override
	public void insertStudent(Student student) {
		studentDAOImpl.insertStudent(student);
	}

	@Override
	public List<Student> searchAll() {
		return studentDAOImpl.searchAll();
	}

	@Override
	public void deleteStudent(int studId) {
		studentDAOImpl.deleteStudent(studId);
	}

	@Override
	public Student searchStudent(int studId) {
		return studentDAOImpl.searchStudent(studId);
	}

	@Override
	public void updateStudent(Student s) {
		studentDAOImpl.updateStudent(s);
	}
	
}
