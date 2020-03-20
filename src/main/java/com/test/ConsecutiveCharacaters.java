package com.test;

public class ConsecutiveCharacaters {
    public static String removeConsecutive(String input){

        String removed="";
        int next=1;
        for(int i=0; i<input.length();i++){
            if(input.charAt(i)!=input.charAt(next)){
                removed=removed+input.charAt(i);
               // System.out.println(removed);
            }
            if(next<input.length()-1){
                next++;
            }

        }
        removed=removed+input.charAt(input.length()-1);
        return removed;
    }

    public static void main(String[] args) {
        System.out.println(ConsecutiveCharacaters.removeConsecutive("aaabbbccd"));
    }

}
