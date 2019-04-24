package com.example.demo.test;


import java.util.concurrent.locks.ReentrantLock;


public class ReentrantLockTest {


    private static ReentrantLock lock = new ReentrantLock(false) ;

    private static int count = 0 ;


    public static void testFail(){
        lock.lock();

        try {
            count ++ ;

            System.out.println("I have obtain the lock"+" , count= "+count);
            System.out.println("I am happy ");
        }catch (Exception e){
            lock.unlock();
            System.out.println("I have release the lock");
        }
    }

    public static void main(String[] args)  {

        Runnable runnable = () -> {
            System.out.println("this is "+count+"thread start");
          testFail();
        } ;

        Thread[] threads = new Thread[10];
        for(int i = 0;i<10;i++){
            threads[i] = new Thread(runnable);
        }

        threads[0].start();
        threads[1].start();
/*        for(int i=0;i<10;i++){

            threads[i].start();

           try {
               Thread.currentThread().sleep(22);
           }catch (Exception e){

           }

        }*/
    }

}
