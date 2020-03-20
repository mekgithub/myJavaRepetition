package com.w3.schoolstopics;

public class MethodwithIf {
    static void checkAge(int age){
        if(age<18){
            System.out.println("You can not drive");
        }
        else {
            System.out.println("You can drive if you have a license");
        }
    }

    public static void main(String[] args) {
        checkAge(23);
    }
}
