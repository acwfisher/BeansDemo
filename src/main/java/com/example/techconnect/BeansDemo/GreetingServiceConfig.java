package com.example.techconnect.BeansDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Flags to spring that there is something important for setup here
public class GreetingServiceConfig {

    @Bean // Thing that gets picked up
    public String timeOfDay() {
        return "morning";
    }
}
