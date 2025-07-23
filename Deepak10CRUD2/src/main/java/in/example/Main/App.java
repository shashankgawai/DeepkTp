package in.example.Main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.example.resources.SpringConfigFile;


//#12 Spring NamedParameterJdbcTemplate Tutorial || Not to use JdbcTemplate Positional Parameter

public class App
{
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		NamedParameterJdbcTemplate obJd = context.getBean(NamedParameterJdbcTemplate.class);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roll_no", 110);
		map.put("name", "Pranali");
		map.put("city", "Wardha");
		
		
//		In that are Chnaged Config File , Use NamedParameterJDBC this :rol,:nam,:city
//		to better Understanding
		String sqlString="Insert into Student values(:roll_no,:name,:city)";
		obJd.update(sqlString, map);
		
		
	}
}