package com.hnit.demo2;

public class demo3 {
    public static void main(String[] args) {
        //1.创建一个对象
        StringBuilder sb = new StringBuilder("abc");
        String s = sb.append("aaa").append("bbb").append("ccc").toString();
        //2.打印一下
        System.out.println(sb);
        System.out.println(s);
    }
}
