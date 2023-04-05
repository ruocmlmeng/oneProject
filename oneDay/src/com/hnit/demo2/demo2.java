package com.hnit.demo2;

import java.util.Scanner;

import static java.time.Clock.system;

public class demo2 {
    public static void main(String[] args) {
        //1.先定义一个账号密码
        String rightUserName = "zhangsan";
        String rightUserpassword = "12345";

        Scanner sc = new Scanner(System.in);
        //2.设置一个登录界面
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String userPassword = sc.next();

            //3.进行比较
            if (userName.equals(rightUserName) && userPassword.equals(rightUserpassword)) {
                System.out.println("用户登录成功！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账户" + rightUserName + "被锁定请联系黑马客户小姐姐，电话xxx-xxxx");
                } else {
                    System.out.println("用户登录失败，账户名或密码错误，还剩" + (2 - i) + "次机会");
                }

            }
        }

    }
}
