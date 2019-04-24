package com.example.demo.test;

public class StringTest {

    public static void main(String[] args) {
        String str = "ab" ;
        String str2 = "cd" ;
        String str3= "ab"+"cd" ;
        String str4 = "abc"+"d" ;
        String str5="abcd"+"" ;
        String str6=str+str2 ;
        System.out.println(str3==str4); //true
        System.out.println("str3==str4::"+(str3==str4)); //true
        System.out.println("str3==str4::"+str3==str4); //false
        System.out.println(str4==str5);
        System.out.println("str5==str6::"+(str5==str6));

    }
}
