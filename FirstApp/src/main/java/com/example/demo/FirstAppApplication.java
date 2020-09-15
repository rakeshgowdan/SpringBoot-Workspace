package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont=SpringApplication.run(FirstAppApplication.class, args);
		System.out.println("Welcome to Spring Boot App!!");
		
		Student s1=cont.getBean(Student.class);
		s1.show();
	}

}
