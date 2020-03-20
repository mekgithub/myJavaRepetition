package com.w3.schoolstopics;
//THIS IS AN ABSTRACT CLAS
abstract class Person {
    public String name="John";
    public int age=24;
    public abstract void study();   //abstract method
}

class Student extends Person{  //this is subclass (inherit from person)
    public int graduateionYear=2018;
    public void study(){        // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
class MyClass{
    public static void main(String[] args) {
        Student myObj=new Student();

        System.out.println(myObj.name);
        System.out.println(myObj.age);
        System.out.println(myObj.graduateionYear);
        myObj.study();
    }
}

