package com.hnit.demo4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        student s1 = new student("zhangsan",20);
        student s2 = new student("lisi",30);
        student s3 = new student("wangwu",40);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);

            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
