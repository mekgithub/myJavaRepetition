package com.test;

import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome(){
        String word="madam";
        String reversed="";
        for(int i=word.length()-1; i>=0;i-- ){
            reversed=reversed+word.charAt(i);
            if(word.equals(reversed)){
                System.out.println("palindrome");
            }else {
                System.out.println("Not Palindrome");
            }
        }
    }

    public static void main(String[] args) {
        isPalindrome();
    }
}
