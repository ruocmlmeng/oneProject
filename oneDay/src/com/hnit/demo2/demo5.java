package com.hnit.demo2;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        /*
        * 使用StringBuilder的场景
        * 1、字符串的凭借
        * 2、字符串的反转
        * */
        //1.定义输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2.使用StringBuilder
        String s = new StringBuilder(str).reverse().toString();
        if(s.equals(str)){
            System.out.println("该字符串是对称字符串");
        }else{
            System.out.println("该字符串不是对称字符串");
        }

    }
}
