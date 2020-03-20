package com.w3.schoolstopics;

public class Constractor {
    int x;

    public Constractor(){
        x=5;
    }

    public static void main(String[] args) {
        Constractor myObj=new Constractor();//The constructor is called when an object of a class is created
        System.out.println(myObj.x);
    }
}

//constractor lar objelerin baslangic(initial) degerlerini ayarlamak(set) icin kullanilirlar.
// It can be used to set initial values for object attributes:mesela burada object attribute baslanggic degeri olarak x e 5 verdik
//Note that the constructor name must match the class name, and it cannot have a return type (like void).
//Also note that the constructor is called when the object is created.
//All classes have constructors by default:
// if you do not create a class constructor yourself, Java creates one for you.
// However, then you are not able to set initial values for object attributes.
