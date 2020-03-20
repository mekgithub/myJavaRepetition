package com.classexample;

public class Loans {
    public int calculateMortgage(int month,int monthlyPayment){

        int restOfThePayment=monthlyPayment*(360-month);

        return restOfThePayment;
    }
    public double calaculateCarInsurance(int carPrice,int months){
        double insurance=(carPrice/months)*0.9-months;
        return insurance;
    }

}
