package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(IDocument.class)
public class PDFDocument implements IDocument{

    @Override
    public String getContent() {
        return "PDF";
    }
}
