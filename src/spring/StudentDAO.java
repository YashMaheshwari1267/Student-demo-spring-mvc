package spring;

import java.util.List;

public interface StudentDAO {
	public void insertStudent(Student s);
	
	public List<Student> viewAll();
}