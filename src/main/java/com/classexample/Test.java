package com.classexample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {
        Invoices invoice = new Invoices();
        String myElecetric = invoice.evaulateElectircBill(800);
        String myInternet = invoice.evaulateInternet(250);
       // System.out.println("Elecetric is:" +myElecetric);
        //System.out.println("Interent is:" +myInternet);
        Loans loan=new Loans();
        int mortgage=loan.calculateMortgage(15,1800);
       // System.out.println("The House mortgage total is :"+mortgage);
        double insurance=loan.calaculateCarInsurance(15000,23);
        //System.out.println("The Car insurance monthly is :"+insurance);
    }
}
