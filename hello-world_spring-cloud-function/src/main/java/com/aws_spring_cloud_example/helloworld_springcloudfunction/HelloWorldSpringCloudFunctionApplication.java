package com.aws_spring_cloud_example.helloworld_springcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class HelloWorldSpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringCloudFunctionApplication.class, args);
	}

	/*
	 curl -H 'Content-type: Application/json' localhost:8080/uppercase -d '"hello"'
     curl -H 'Content-type: Application/json' localhost:8080/helloWorld

     Then in aws in env variables define function like:
     key: FUNCTION_NAME value: nameOfYourFunction

     create shade file with maven package shade:shade
     adjust manifest in shaded file:
     add there line: Main-Class: com.aws_spring_cloud_example.helloworld_springcloudfunction.HelloWorldSpringCloudFunctionApplication

     define handler method in your lambda function like:
		com.aws_spring_cloud_example.helloworld_springcloudfunction.SpringLambdaHandler
	 */

	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Function<String, String> lowerCase() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Function<String, String> helloName(){
		return s -> "Hello " + s;
	}

	@Bean
	public Supplier<String> helloWorld(){
		return () -> "Hello World!";
	}



}
