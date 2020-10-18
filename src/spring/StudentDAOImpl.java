package spring;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void insertStudent(Student s) {
		jt.update("INSERT INTO STUDENTS VALUES(?,?)");
	}

	@Override
	public List<Student> viewAll() {
		return null;
	}

}
