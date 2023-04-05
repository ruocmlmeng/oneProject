package com.hnit.demo3;

import java.util.StringJoiner;

public class demo2 {
    public static void main(String[] args) {
        //1.定义对象
        StringJoiner sj = new StringJoiner(",","[","]");
        //2.添加内容
        sj.add("1").add("2").add("3");

        //3.打印
        System.out.println(sj);//打印的时对象

        String s = sj.toString();
        System.out.println(s);//打印的是字符串
    }
}
