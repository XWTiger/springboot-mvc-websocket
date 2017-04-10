package test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@MapperScan("test.com")
@EnableScheduling
@SpringBootApplication 
@ComponentScan
public class Application {

	/*@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new DataSource();
	}

	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver
				.getResources("classpath:/mybatis/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}*/
	
	  /*@Bean
	    public InternalResourceViewResolver internalResourceViewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("/WEB-INF/");
	        resolver.setSuffix(".html");
	        return resolver;
	    }*/
	
	public static void main(String[] args) {
		System.out.println("--------spring boot begin---------");
		SpringApplication.run(Application.class, args);
		System.out.println("--------spring boot end---------");
	}

}
