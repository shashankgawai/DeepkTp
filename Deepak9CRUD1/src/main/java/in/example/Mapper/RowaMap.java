package in.example.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.example.Bean.Student;

public class RowaMap implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setRoll_no(rs.getInt("roll_no"));
		student.setName(rs.getString("name"));
		student.setCity(rs.getString("city"));
		
		return student;
	}

}
