package com.w3.schoolstopics;
//EMPLOYEE DEVAMI
public class Employer extends Employee {//SubClass

    private int responsiblePerson;//Extra ozellik sonradan bunu asagidaki constractore ekledik
    public Employer(String name,int salary,String department,int responsiblePerson){
        super(name,salary,department);
    }
    public void hikeUp(int hikeAmount){
        System.out.println("Employees "+ hikeAmount+ " $ get a increase of their salary");
    }
}
