package com.w3.schoolstopics;

public class Objects {
    int x=11;        //we created x attribute and we'll acces the atribute using object

    public static void main(String[] args) {

        Objects myObj1=new Objects();
        Objects myObj2=new Objects();
        System.out.println(myObj1.x);//we can access attributes by creating an object of the class
        System.out.println(myObj2.x);
    }
}
