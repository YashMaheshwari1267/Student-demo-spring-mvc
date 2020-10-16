package com.spring.mvc.service;

import com.spring.mvc.model.*;
import java.util.List;

public interface StudentService {
	
	public void insertStudent(Student s);
	
	public List<Student> viewAll(); 
}