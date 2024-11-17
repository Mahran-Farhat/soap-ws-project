package com.example.client;


import com.example.client.addition.AdditionImpl;
import com.example.client.addition.AdditionImplService;

public class AdditionServiceClient {
    public static void main(String[] args) {
       // Create a service instance
        AdditionImplService service = new com.example.client.addition.AdditionImplService();

        // Get the port (binding to the service)
        AdditionImpl additionService = service.getAdditionImplPort();

        int a = Clavier.readNumber();
        int b = Clavier.readNumber();

        // Call the add method
        int response = additionService.add(a, b);

        // Print the response
        System.out.println("Response from service: " + response);
    }
}
