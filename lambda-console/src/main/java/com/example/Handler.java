package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class Handler implements RequestHandler<Object, String> {

    //mvn package shade:shade

    public String handleRequest(Object o, Context context) {

        Message m = new Message("Hello world!" +
                o.toString() +
                context.toString() );

        return m.toString();
    }

    public static void main(String[] args) {

    }
}
