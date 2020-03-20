package com.w3.schoolstopics;

import java.util.Scanner;

public class HesapLOgin {
    public boolean HesapLogin(Hesap account){
        Scanner scanner=new Scanner(System.in);
        String userName;
        String password;

        System.out.println("username : ");
        userName=scanner.nextLine();
        System.out.println("Password : ");
        password=scanner.nextLine();

        if(account.getUserName().equals(userName) && account.getPassword().equals(password)){
            return true;
        }
        else {
            return false;
        }
    }
}
