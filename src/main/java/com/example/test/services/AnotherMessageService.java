package com.example.test.services;

import com.example.test.interfaces.MessageService;
import org.springframework.stereotype.Service;

@Service("defaultMessageService")
public class AnotherMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "second trial!";
    }
}
