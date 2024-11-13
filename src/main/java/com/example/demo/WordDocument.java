package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class WordDocument implements  IDocument{
    @Override
    public String getContent() {
        return "Word";
    }
}
