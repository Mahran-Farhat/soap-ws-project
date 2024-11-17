package com.example.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello(@WebParam(name = "name") String name) {
        return "Hello, " + name + "!";
    }
}
