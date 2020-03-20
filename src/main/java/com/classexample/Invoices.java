package com.classexample;

public class Invoices {
    public String evaulateElectircBill(int consumption){
        String result="";
        if(consumption>500 && consumption<1000){
            result="Good Job";

        }else if(consumption>=1000 && consumption <1500){
           result=" Not Bad";
        }else if(consumption>=1500){
            result="Start to save Energy";

        }else{
            System.out.println("Consumption is out of scope");
        }
        return result;
    }
    public String evaulateInternet(int speed){
        String result="";
        if(speed>1000){
            result="Good";

        }else if(speed>100){
            result="Super";
        }else{
            result="Bad Speed";
        }
        return result;
    }
}
