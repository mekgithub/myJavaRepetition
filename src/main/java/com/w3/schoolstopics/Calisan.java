package com.w3.schoolstopics;

public class Calisan {
    String name;
    String department;
    int salary;
    int responsibleperson;

    public Calisan(String name,String department,int salary,int responsibleperson){
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.responsibleperson=responsibleperson;

    }
    public void showinformation(){
        System.out.println("name : "+name);
        System.out.println("department :" +department);
        System.out.println("salary : "+salary);
        System.out.println("responsible for : "+responsibleperson+" person");

    }
    public void work(){
        System.out.println("Employee are working");
    }
}
