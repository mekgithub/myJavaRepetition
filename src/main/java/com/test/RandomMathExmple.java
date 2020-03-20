package com.test;

import java.util.Scanner;

public class RandomMathExmple {
    public static void main(String[] args) {
        System.out.println( RandomMathExmple.randomPassword());
    }
    public static String randomPassword() {
       String password="";
       double rand;
       int randInt;
       char charInt;
       for(int i=1; i<=6; i++){
           rand=Math.random()*(122-97)+97;
           randInt=(int)rand;
           charInt=(char)randInt;
           password=password+charInt;

       }
        return password;
    }
}
