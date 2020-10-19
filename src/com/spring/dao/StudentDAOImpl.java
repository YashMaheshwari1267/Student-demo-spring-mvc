package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertStudent(Student student) {
		jdbcTemplate.update("insert into students values(?,?)", student.getId(), student.getName());
	}

	public List<Student> searchAll() {
		List<Student> list = jdbcTemplate.query("select * from students", new Object[] {},
				(rs, rowNum) -> new Student(rs.getInt("id"), rs.getString("name")));
		return list;
	}

	public void deleteStudent(int studId) {
		jdbcTemplate.update("delete from students where id=?", studId);
	}

	@Override
	public Student searchStudent(int studId) {
		Student s = (Student) jdbcTemplate.queryForObject("select * from students where id=?", new Object[] { studId },
				BeanPropertyRowMapper.newInstance(Student.class));
		return s;
	}

	@Override
	public void updateStudent(Student s) {
		jdbcTemplate.update("update students set name=? where id=?", s.getName(), s.getId());
	}

	@Override
	public List<Student> sortList(String sortBy) {
		List<Student> list = jdbcTemplate.query("select * from students order by "+sortBy+ " asc", new Object[] {},
				(rs, rowNum) -> new Student(rs.getInt("id"), rs.getString("name")));
		return list;
	}

}
