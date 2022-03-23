package com.amarmodi.springwebflux.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Filter;

@Configuration
public class SubscriberApplication {

    @Bean
    public Filter logFilter(){
        return null;
    }
}
