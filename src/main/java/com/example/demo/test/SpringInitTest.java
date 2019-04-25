package com.example.demo.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInitTest implements InitializingBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("") ;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is afterPropertiesSet");
    }
}
