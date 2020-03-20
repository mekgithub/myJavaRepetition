package com.w3.schoolstopics;

public class HesapMAIN {
    public static void main(String[] args) {
        HesapATM atm=new HesapATM();
        Hesap account=new Hesap("mek","12345",2000);
        atm.run(account);
        System.out.println("Exit the prgram...");
    }


}
