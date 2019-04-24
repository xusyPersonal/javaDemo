package com.example.demo.entity;

public abstract class Person {

    private String head ;

    private String hand ;

    private String eye ;

    public Person(String head, String hand, String eye) {
        this.head = head;
        this.hand = hand;
        this.eye = eye;
        System.out.println("this is pserosn ");
    }

    public Person(){
        System.out.println("this is person no params");
    }

    public void drink(){
        System.out.println("I am drinking in "+this.getClass().getSimpleName());
    }

    public String lefttoSon(){
        return "this is money to my son 1000000 dollar" ;
    }


    public abstract void eat();

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", hand='" + hand + '\'' +
                ", eye='" + eye + '\'' +
                '}';
    }
}
