package com.example.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class AdditionImpl implements Addition {
    @Override
    public int add(@WebParam(name = "a") int a, @WebParam(name = "b")  int b){
        System.out.println("Calculate the total of "+a+" + "+b);
        return a + b;
    }
}
