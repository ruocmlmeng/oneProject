package com.hnit.demo4;

import java.util.ArrayList;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<student> list= new ArrayList<>();

        //键盘录入三个学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            student stu =new student();
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }
        for (int i = 0; i < list.size(); i++) {

            student stu = list.get(i);
            System.out.println(stu.getName()+ "," +stu.getAge());
        }
    }
}
