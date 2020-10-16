package com.spring.mvc.dao;

import com.spring.mvc.model.*;
import java.util.List;

public interface StudentDAO {
	public void insertStudent(Student s);
	
	public List<Student> viewAll();
}