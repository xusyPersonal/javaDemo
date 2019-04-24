package com.example.demo.test;

import com.example.demo.entity.Book;

import java.lang.reflect.Method;

public class BookTest {

    public static void main(String[] args) {

        try{
//            Class<?> bookClazz =  Class.forName("com.example.demo.test.Book") ; //获取Calss对象
          Class<?> bookClazz =   Book.class ; //获取Calss对象
            System.out.println("simpleName:"+bookClazz.getSimpleName()+"\r\n TypeName"+bookClazz.getTypeName()+"\r\n Fields:"+bookClazz.getDeclaredFields());
            Book book =  (Book) bookClazz.newInstance() ;
            book.borrow();
           //根据类实例调用方法
           book.returnBooks("雨后的彩虹");  //如果不在一个包下 只能访问public方法
           //获取方法对象 调用方法
//           Method returnBooksMethod =bookClazz.getMethod("returnBooks", String.class) ; //传入方法名以及方法参数类型  这种获取方法的方式不能访问私有方法
            Method returnBooksMethod =  bookClazz.getDeclaredMethod("returnBooks", String.class) ;
            returnBooksMethod.setAccessible(true); //访问私有方法 需要设置权限
            returnBooksMethod.invoke(book,"莎士比亚") ; //传入类实例以及方法参数
        }catch (Exception e){
            System.out.println("反射调用出错！");
        }

    }
}
