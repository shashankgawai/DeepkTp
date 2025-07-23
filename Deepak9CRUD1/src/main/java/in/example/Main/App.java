package in.example.Main;

import java.util.List;

import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.example.Bean.Student;

import in.example.Mapper.RowaMap;
import in.example.resources.SpringConfigFile;

//#11 Spring JDBC Tutorial || CRUD Operations using JdbcTemplate in Hindi by Deepak

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		int rollno = 120;
		String nameString = "Shashank";
		String cityString = "Kalyan";

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		JdbcTemplate obJdbcTemplate = (JdbcTemplate) context.getBean("jd1");

//      Insert
//		String queryString = "Insert into Student values (?,?,?)";
//		int count = obJdbcTemplate.update(queryString, rollno, nameString, cityString);
//		
//		update
//		String queString ="Update Student set name='Anup' where roll_no=130";
//		int count = obJdbcTemplate.update(queString);

//		String queString ="Update Student set name=? where roll_no=?";
//		int count = obJdbcTemplate.update(queString,nameString,rollno);

//		Delete
//		String sqString="Delete From Student where roll_no=?";
//		int count = obJdbcTemplate.update(sqString,rollno);

//		Select For All Select Fetch Values
//		String sqString = "Select * from Student";
//		List<Student> sList = obJdbcTemplate.query(sqString, new RowaMap());
//
//		for (Student stu : sList)
//			System.out.println(stu);
		
//		For return Single Object form DB
		String sqString = "Select * from Student where roll_no=?";
		Student obj = obJdbcTemplate.queryForObject(sqString, new RowaMap(),rollno);
		System.out.println(obj);

//		if (count > 0) {
//			System.out.println("Values Are Store");
//		} else {
//			System.out.println("Not Store");
//		}

	}
}
