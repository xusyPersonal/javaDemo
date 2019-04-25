package com.example.demo.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyXmlBean {

    public MyXmlBean(){
        System.out.println("执行MyXmlBean: 构造方法");
    }
    public void initMethod() {
        System.out.println("执行MyXmlBean: init-method");
    }
    public void destroyMethod() {
        System.out.println("执行MyXmlBean: destroy-method");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProperties.xml");
        context.close();
    }
}
