package com.w3.schoolstopics;
// CONSTARCTOR 3
public class Account {
    private String accounNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNo;

    public Account(){ // creating constractor;
        System.out.println("Createing self constractor");
    }
    public Account(String account,double balance1, String name, String email, String phone){//burada ayni zamnda method overloading
                                                                                            // yapilmis oluyor
        this.accounNumber=account;
        this.balance=balance1;
        this.name=name;
        this.email=email;
        this.phoneNo=phone;

    }

}
