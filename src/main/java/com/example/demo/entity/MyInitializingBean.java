package com.example.demo.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PreDestroy;

public class MyInitializingBean implements InitializingBean,DisposableBean {

    public MyInitializingBean(){
        System.out.println("执行InitAndDestroySeqBean: 构造方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行InitAndDestroySeqBean: afterPropertiesSet");
    }


    @PreDestroy
    public void preDestroy()  {
        System.out.println("执行InitAndDestroySeqBean: preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行InitAndDestroySeqBean: destroy");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProperties.xml");
//        MyInitializingBean myInitializingBean = (MyInitializingBean) context.getBean("myInitializingBean") ;
//        myInitializingBean.toString() ;
        context.close();
    }


}
