package com.project.assignment.EmployeeProject;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.project.assignment.EmployeeProject.entity.HibernateUtil;




/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer
{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}
	 SessionFactory factory= HibernateUtil.getSessionFactory();
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       
        SpringApplication.run(App.class, args);
      
        
        
        
        
        
    }
}
