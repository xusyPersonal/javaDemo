package com.example.demo.test;

import java.util.concurrent.TimeUnit;

public class TimeTest {

    public static void main(String[] args) {
        System.out.println("day is "+TimeUnit.DAYS.toDays(3600*24));
        System.out.println("day is "+TimeUnit.MINUTES.toDays(3600*24));
        System.out.println("day is "+TimeUnit.HOURS.toDays(3600*24));
    }
}
