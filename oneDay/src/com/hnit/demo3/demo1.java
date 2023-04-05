package com.hnit.demo3;

import java.util.StringJoiner;

public class demo1 {
    public static void main(String[] args) {
        //1.创建一个对象
        StringJoiner sj = new StringJoiner("----");

        //2.像对象中添加字符
        sj.add("aaa").add("bbb").add("ccc");

        //3.打印对象
        System.out.println(sj);
    }
}
