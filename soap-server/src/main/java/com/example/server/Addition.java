package com.example.server;

import javax.jws.WebService;

@WebService
public interface Addition {
    int add(int a, int b);
}
