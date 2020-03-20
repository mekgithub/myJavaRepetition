package com.test;

import java.util.Scanner;

public class Password {
    public static String designPassword(String password){
        String answer="";
        if(password.length()>=6){
            answer="Pasword OK";
        }
        else{
            answer="Not Ok";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(designPassword("wertyuio"));
    }
}
