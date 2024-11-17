package com.example.server;

public class SoapServicePublisher {
    public static void main(String[] args) {
        // Create an instance of the GreetingServiceImpl class
        GreetingServiceImpl greetingService = new GreetingServiceImpl();
        // Publish the GreetingService service
        javax.xml.ws.Endpoint.publish("http://localhost:8080/greeting", greetingService);
        // generate an instance of the AdditionImpl class
        AdditionImpl addition = new AdditionImpl();
        // Publish the Addition service
        javax.xml.ws.Endpoint.publish("http://localhost:8080/addition", addition);
        System.out.println("GreetingService is published at http://localhost:8080/greeting");
    }
}
