package com.takeo.takeostudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.takeo")
public class TakeostudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakeostudentApplication.class, args);
	}

}
