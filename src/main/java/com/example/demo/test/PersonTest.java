package com.example.demo.test;

import com.example.demo.entity.Man;
import com.example.demo.entity.Person;
import com.example.demo.entity.Woman;

/**
 * 讨论 继承 多态的概念
 * 1、父类的抽象方法 子类必须实现 （否则编译错误）
 * 2、父类的方法 子类都可以重写（哪怕父类已经有了实现，运行时可根据具体调用对象执行父类还是子类方法，参考 man.drink();  //调用子类的方法  多态的体现）
 * 3、多个子类重写父类的方法 ，运行时可根据调用对象区分调用具体哪个子类的方法 （参考eat（）调用）
 *
 */
public class PersonTest {

    public static void main(String[] args) {
        Person man = new Man() ;
        man.eat();
        Person woman = new Woman() ;
        woman.eat();

        man.drink();

    }
}
