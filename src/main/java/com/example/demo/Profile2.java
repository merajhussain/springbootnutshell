package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("profile2")
public class Profile2 implements  ProfileInterface{


    @Override
    public void process() {
        System.out.println("Profile2 process");
    }
}
