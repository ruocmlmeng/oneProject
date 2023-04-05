package com.hnit.demo5;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String s = ArrayUtil.printArray(arr);
        System.out.println(s);
        double[] arr1 = {1.2,4.6,7.9,8,3};
        double average = ArrayUtil.getAverage(arr1);
        System.out.println(average);

    }
}
