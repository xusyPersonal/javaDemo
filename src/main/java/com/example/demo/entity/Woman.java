package com.example.demo.entity;

public class Woman extends Person{
    @Override
    public void drink() {
        super.drink();
        System.out.println("this is woman drink");
    }

    @Override
    public String lefttoSon() {
        return super.lefttoSon();
    }

    @Override
    public void eat() {

        System.out.println("this is woman eat");
    }
}
