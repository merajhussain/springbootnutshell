package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {


    public Student()
    {
        System.out.println("student created");
    }

    @Autowired
    College college;



}
