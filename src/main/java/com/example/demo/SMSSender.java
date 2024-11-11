package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SMSSender implements NotificationSenderService{
    @Override
    public void send() {
        System.out.println("SMS sent successfully");
    }
}
