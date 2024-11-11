package com.example.demo;


import org.springframework.stereotype.Service;

@Service
public class EmailSender implements NotificationSenderService{
    @Override
    public void send() {

        System.out.println("Email Sent Successfully");
    }
}
