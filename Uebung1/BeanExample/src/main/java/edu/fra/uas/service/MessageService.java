package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private String message;
    private int counter = 0;

    @Autowired
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    public String getMessage(){
        log.debug("Message got: " + message);
        return message;
    }

    public void setMessage(String message){
        log.debug("Message set: "+ message);
        this.message = message;
    }

    public int increaseCounter(){
        counter++;
        log.debug("Counter increased: " + counter);
        return counter;
    }

    public int getCounter(){
        log.debug("Counter got: " + counter);
        return counter;
    }



}
