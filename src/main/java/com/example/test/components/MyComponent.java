package com.example.test.components;

import com.example.test.interfaces.MessageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final MessageService messageService;
    public MyComponent(@Qualifier("secondMessageService") MessageService messageService) {
        this.messageService = messageService;
    }

    public String displayMessage() {
        String message = messageService.getMessage();
        return message;
    }
}
