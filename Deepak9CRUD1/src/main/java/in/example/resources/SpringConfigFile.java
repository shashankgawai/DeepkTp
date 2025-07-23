package in.example.resources;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public DriverManagerDataSource driverManager()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/deepakcrud");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}

	@Bean
	public JdbcTemplate jd1()
	{
		
		return new JdbcTemplate(driverManager());
	}
}
