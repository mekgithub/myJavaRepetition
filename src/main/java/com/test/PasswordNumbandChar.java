package com.test;

public class PasswordNumbandChar {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++) {
            System.out.println(PasswordNumbandChar.paswordNumbLetter());
        }
    }
    public static String paswordNumbLetter(){
        String password="";
        int randInt;
        double rand;
        char randChar;
        for(int i=1;i<4; i++){
            rand=Math.random()*(122-65)+65;
            password=password+(char)rand;

        }
        for(int j=1; j<4; j++){
            rand=Math.random()*10;
            password=password+(int)rand;

        }
        return password;
    }
}
