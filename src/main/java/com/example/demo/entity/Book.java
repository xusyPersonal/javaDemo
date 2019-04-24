package com.example.demo.entity;

import java.util.Date;

public class Book {

    private String bookNanme ;
    private Date date ;

    public Book() {
        this("");
    }


    public Book(String bookNanme) {
        this.bookNanme = bookNanme;
        System.out.println("this is constructor");
    }

    static{
        System.out.println("this is static block");
    }

    {
        System.out.println("this is code block");
    }

  public void   borrow(){
      System.out.println("this is a borrow method");
    }

    public void returnBooks(String bookNanme){
        System.out.println("I have return book:"+bookNanme);
    }



    public static void main(String[] args) {
        Book book = new Book() ;
       ClassLoader classLoader =  Book.class.getClassLoader() ;
        System.out.println("classLoader"+classLoader);
    }

}
