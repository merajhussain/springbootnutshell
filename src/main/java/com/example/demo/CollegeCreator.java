package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeCreator {

    @Bean
    public College createCollegeBean()
    {
        return new College();
    }
}
