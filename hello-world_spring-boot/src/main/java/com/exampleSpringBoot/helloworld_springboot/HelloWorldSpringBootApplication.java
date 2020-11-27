package com.exampleSpringBoot.helloworld_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSpringBootApplication {

	//create custom configuration in maven to run mvn package shade:shade in case you have opened multiple projects
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringBootApplication.class, args);
	}

}
