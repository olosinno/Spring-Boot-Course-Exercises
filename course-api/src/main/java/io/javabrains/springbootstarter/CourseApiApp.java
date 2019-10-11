package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // tells SB that this is our application's starting point
public class CourseApiApp {

	public static void main(String[] args) {
		// Creates servlet container, starts it and hosts application
		SpringApplication.run(CourseApiApp.class, args); // Calls static method .run where main method is and passes it through args to run SB
	}

}
