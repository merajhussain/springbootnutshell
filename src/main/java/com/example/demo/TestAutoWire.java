package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestAutoWire {


    public TestAutoWire()
    {
        System.out.println("Test Autowire created");
    }
    @Autowired
    AwDep dep;

    @Autowired
    EventPuller eventpuller;

    @Autowired
    ProfileInterface profileInterface;



    void process(){
         eventpuller.pullEvents();

         System.out.println(eventpuller.getSource());

         profileInterface.process();
    }

}
