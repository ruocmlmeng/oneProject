package com.hnit.demo2;

public class demo4 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        System.out.println(sb);
        //把StringBuilder变为字符串
        String s = sb.toString();
        System.out.println(s);
    }
}
