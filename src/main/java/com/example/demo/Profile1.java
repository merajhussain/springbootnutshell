package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("profile1")
public class Profile1 implements  ProfileInterface{


    @Override
    public void process() {
        System.out.println("Profile1 Process");
    }
}
