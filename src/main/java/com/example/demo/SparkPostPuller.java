package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SparkPostPuller implements EventPuller{

    SparkPostPuller()
    {

        System.out.println("Sparkpost puller created");
    }

    @Override
    public void pullEvents() {

         System.out.println("Pulling sparkpost events");
    }

    @Override
    public String getSource() {
        return "";
    }
}
