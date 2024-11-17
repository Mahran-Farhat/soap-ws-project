package com.example.client;

import com.example.client.greeting.GreetingServiceImpl;
import com.example.client.greeting.GreetingServiceImplService;

public class GreetingServiceClient {

    public static void main(String[] args) {
        // Create a service instance
        GreetingServiceImplService service = new GreetingServiceImplService();

        // Get the port (binding to the service)
        GreetingServiceImpl greetingService = service.getGreetingServiceImplPort();

        // Call the sayHello method
        String response = greetingService.sayHello("mahran");

        // Print the response
        System.out.println("Response from service: " + response);
    }
}
