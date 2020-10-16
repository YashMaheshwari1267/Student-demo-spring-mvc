package com.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.mvc.model.Student;

public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void insertStudent(Student s) {
		jt.update("INSERT INTO STUDENT VALUES(?,?)");
	}

	@Override
	public List<Student> viewAll() {
		return null;
	}

}
