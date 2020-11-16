package com.example.hello;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.stereotype.Component;

@Component
public class Hello implements RequestHandler<Object, String> {

    //mvn package shade:shade
    @Override
    public String handleRequest(Object o, Context context) {
        return "Hello world! " + o.toString();
    }
}
