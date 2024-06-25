package com.example.demo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestPcPd implements InitializingBean, DisposableBean {

    
    @Override
    public void destroy() throws Exception {
        System.out.println("TestPcPd Bean destoryed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("TestPcPd Bean created");

    }
}
