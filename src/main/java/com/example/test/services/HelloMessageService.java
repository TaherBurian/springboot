package com.example.test.services;

import com.example.test.interfaces.MessageService;
import org.springframework.stereotype.Service;

@Service("secondMessageService")
public class HelloMessageService implements MessageService {
    public String getMessage(){
        return "Hello";
    }
}
