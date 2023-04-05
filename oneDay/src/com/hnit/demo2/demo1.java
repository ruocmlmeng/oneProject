package com.hnit.demo2;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
//        //1.键盘录入一个adc
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串");
//        String str1 = sc.next();
//        //2.假如再定义一个字符串abc
//        String str2 = "abc";
//        System.out.println(str1 == str2);

        //1.键盘录入abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();
        //2.再定义一个字符串abc
        String str2 = "abc";
        System.out.println(str1 == str2);
    }
}
