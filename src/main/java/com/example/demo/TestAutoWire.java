package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    @Qualifier("emailSender")
    NotificationSenderService notificationSenderService;



    void process(){
         eventpuller.pullEvents();

         System.out.println(eventpuller.getSource());

         profileInterface.process();
         notificationSenderService.send();
    }

}
