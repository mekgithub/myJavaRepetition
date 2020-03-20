package com.w3.schoolstopics;

public class Exceptionn {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[5]);
        }catch (Exception e) {
            System.out.println("something went wrong");
        }
    }
}
