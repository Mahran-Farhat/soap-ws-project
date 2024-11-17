package com.example.server;

import javax.jws.WebService;

@WebService
public interface GreetingService {
    String sayHello(String name);
}
