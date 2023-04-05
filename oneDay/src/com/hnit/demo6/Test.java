package com.hnit.demo6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("zhangsan",20);
        Student stu2 = new Student("lisi",23);
        Student stu3 = new Student("wangwu",30);

        //2.将学生添加到集合中去
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //3.调用工具类的方法
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
