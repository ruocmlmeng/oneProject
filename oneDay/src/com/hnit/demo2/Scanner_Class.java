package com.hnit.demo2;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        //1.直接赋值
        String s = "薇恩";

        //2.使用new的方式来获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //3.传递一个字符串，根据传递的字符串内容崽创建一个新的字符串
        String s3 = new String("abc1");
        System.out.println(s3);

        //4.传递一个字符数组，根据字符串的内容崽创建一个新的字符串对象
        //需求：我们要修改字符串的内容。abc Qbc
        //acc --> {'a','c' , 'c' } -->{'Q','b',''c} -->"Qbc"
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);

        //5.传递一个字节数组，根据数组的内容再创建一个新的字符串对象
        byte[] bytes = {97,98,99 ,100};//先查ASCLL码表
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
