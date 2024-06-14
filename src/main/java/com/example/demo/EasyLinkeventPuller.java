package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class EasyLinkeventPuller implements EventPuller {

    @Value("${easylink.source}")
    String easyLinkSource;

    EasyLinkeventPuller(){
        System.out.println("Easylink event puller created");
    }
    @Override
    public void pullEvents() {

         Object ob;
         System.out.println("Pulling easylink events");
    }

    @PostConstruct
    void checkPostConstruct()
    {
        System.out.println("Post Construct invoked for EasyLinkEventPuller");
    }

    @PreDestroy
    void preDestory()
    {
        System.out.println("Checking predestroy for easylink");
    }
    public String getSource()
    {
        return easyLinkSource;
    }
}
