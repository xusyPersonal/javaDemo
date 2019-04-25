package com.example.demo.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ApplicationContext实现的默认行为就是在启动服务器时将所有singleton bean提前进行实例化
 * (也就是依赖注入)。提前实例化意味着作为初始化过程的一部分，applicationContext实例会创
 * 建并配置所有的singleton bean。通常情况下这是一件好事，因为这样在配置中的任何错误就会
 * 被立刻实现（否则的话可能要话几个小时甚至几天）。
 *
 * 1、spring bean初始化 如果是单例 服务启动就初始化  反之 如果是原型 则不初始化
 * 2、spring bean初始化 如果是原型 需要创建这个bean才初始化
 * 3、spring bean初始化  如果是单例 设置lazy-init=true 则需要延迟加载 需要使用才初始化Bean
 *4、如果一个bean的scope属性为scope="pototype"时，即使设置了lazy-init="false",容器启动时不实例化bean，
 * 而是调用getBean方法实例化的
 */
public class MyAnnotationBean {

    public MyAnnotationBean(){
        System.out.println("执行myAnnoationBean: 构造方法");
    }
    @PostConstruct
    public void postConstructMethod() {
        System.out.println("执行myAnnoationBean: postConstructMethod初始化方法");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("执行myAnnoationBean: destroy-method销毁方法");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProperties.xml","applicationSingleton.xml");

//        context.getBean("myAnnoationBean") ;
        context.close();
    }
}
