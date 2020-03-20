package com.w3.schoolstopics;

public class Constractor2 {//Constarctor Parameters
    int x;
    public Constractor2(int y){
        x=y;
    }

    public static void main(String[] args) {
        Constractor2 myObj=new Constractor2(8);
        System.out.println(myObj.x);
    }
}
