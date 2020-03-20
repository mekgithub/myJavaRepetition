package com.w3.schoolstopics;
//inhertitance nasil oluyor....INHRETINCE
public class Employee {// Supercalss or BaseClass
    private String name;
    private int salary;
    private String department;

    public Employee(String name,int salary,String department){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    public void work(){
        System.out.println("employee are working");
    }
    public void showinformation(){
        System.out.println("name :"+name);
        System.out.println("salary : "+salary);
        System.out.println("department :"+department);
    }
    public void departmentIsChanging(String newDepart){
        this.department=newDepart;
        System.out.println("Dep is cahnging");

    }

}
