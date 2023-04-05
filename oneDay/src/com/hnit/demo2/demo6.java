package com.hnit.demo2;

public class demo6 {
    public static void main(String[] args) {
        //1.定义一个字符串
        int[] arr = {1,2,3};

        //2.定义方法拼接字符串
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i ==arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
