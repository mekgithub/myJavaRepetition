package com.w3.schoolstopics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLis2 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers=new ArrayList<Integer>();
        myNumbers.add(60);
        myNumbers.add(90);
        myNumbers.add(30);
        myNumbers.add(10);
       //Collections.sort(myNumbers);
        for(int i: myNumbers){
            System.out.println(i);
        }
    }
}
