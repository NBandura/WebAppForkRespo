package edu.fra.uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.service.MessageService;

@Component
public class BeanController {

    @Autowired
    private MessageService messageService;

    public String putMessage(String message){
        messageService.setMessage(message);
        return messageService.getMessage();
       }

    public void getMessage(){
        messageService.getMessage();
}

    public int increaseCounter(){
        return messageService.increaseCounter();
    }

    public int getCounter(){
        return messageService.getCounter();
    }
}
