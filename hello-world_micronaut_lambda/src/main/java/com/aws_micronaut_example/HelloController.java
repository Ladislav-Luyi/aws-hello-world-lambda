package com.aws_micronaut_example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get("/hello")
    public String helloMessage(){

        return "Hello world!";
    }
}
