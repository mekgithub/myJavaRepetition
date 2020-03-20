package com.w3.schoolstopics;
//The throw keyword allows you to create a custom error and usied together with an exception types.
public class ExceptionsThrow {

    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Acces denied-You must be at least 18 years old for appliying the job");
        }else {
            System.out.println("Aces granted-You are old enough !");
        }
    }
    public static void main(String[] args) {
        checkAge(19);


    }
}
