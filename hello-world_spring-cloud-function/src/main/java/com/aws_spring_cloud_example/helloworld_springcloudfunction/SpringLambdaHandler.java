package com.aws_spring_cloud_example.helloworld_springcloudfunction;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class SpringLambdaHandler extends SpringBootRequestHandler<String,String> {
}
