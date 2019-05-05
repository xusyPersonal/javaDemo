package com.example.demo.test.Java8;

import com.example.demo.interfaces.Java8Interface;

public class InterfaceFunctionBody implements Java8Interface {

    public static void main(String[] args) {
        InterfaceFunctionBody body = new InterfaceFunctionBody() ;
        body.test();
       Integer integer =  Integer.getInteger("server.port") ;
        System.out.println("server.port:"+integer);


    }
}
