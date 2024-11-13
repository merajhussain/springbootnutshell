package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
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


    @Autowired
    IDocument document;



    void process(){
         eventpuller.pullEvents();

         System.out.println(eventpuller.getSource());

         profileInterface.process();
         notificationSenderService.send();

         System.out.println(document.getContent());
    }

}
