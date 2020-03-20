package com.arrays;

import java.util.Scanner;

public class GiveMeValueOfArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Row Index= ");
        int row=scan.nextInt();
        System.out.println("Column index= ");
        int column=scan.nextInt();
        System.out.println(giveMeValue(row,column));

    }
    public static String giveMeValue(int rowIndex,int columnIndex){
        String result="";
        int [][] myArray={
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7},
                {123,5432,654,387,659876,21},
                {1,432,654,876,5987,654,321,75}
        };
        try {

            result = result + myArray[rowIndex][columnIndex];

        }catch (Exception e){
            System.out.println(" go ahead");
        }
return  result;
    }
}
