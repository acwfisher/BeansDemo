package com.example.techconnect.BeansDemo;

import org.springframework.stereotype.Component;

@Component // Spring will scan this annotation and recognise this class as a bean
public class GreetingService {

    private String timeOfDay;

    public GreetingService(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String greet(String name){
        return String.format("Good %s, %s!", timeOfDay, name);
    }

}
