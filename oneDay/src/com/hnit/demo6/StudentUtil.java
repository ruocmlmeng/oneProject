package com.hnit.demo6;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAge(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int getMax =  max = list.get(i).getAge();
            if(getMax > max){
                max = getMax;
            }
        }
        return max;
    }
}
