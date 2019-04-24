package com.example.demo.entity;

/**
 * 讨论 继承 多态的概念
 * 1、父类的抽象方法 子类必须实现 （否则编译错误）
 * 2、父类的方法 子类都可以重写（哪怕父类已经有了实现，运行时可根据具体调用对象执行父类还是子类方法，参考 man.drink();  //调用子类的方法  多态的体现）
 *
 */
public class Man extends Person {


    public String hand ;

    public Man(){
        System.out.println("this is man ");
    }

    @Override
    public void eat() {
        System.out.println("I am eating in"+this.getClass().getSimpleName());
    }

    @Override
    public void drink(){
        System.out.println("this is drink of "+this.getClass().getSimpleName());
    }



    public static void main(String[] args) {
        Person man  = new Man() ;
        man.drink();  //调用子类的方法  多态的体现
    }

}
