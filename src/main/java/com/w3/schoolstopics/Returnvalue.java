package com.w3.schoolstopics;

public class Returnvalue {
    static int myMethod(int x){//for returning value we should use primitive data type instead of void,and use return keyword..
        return x;
    }
    static int mymethod1(int x,int y){
        return x+y;
    }


    public static void main(String[] args) {
        int z=mymethod1(7,10);
        System.out.println(myMethod(5));
        System.out.println(mymethod1(6,10));
        System.out.println(z);
    }
}
