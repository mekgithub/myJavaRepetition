package com.arrays;

public class TenByTenArray {
    public static void main(String[] args) {
        int[][] numbers=new int[10][10];
        int number=1;
        int rowsum=0;
        int columnSum=0;
        for(int i=0;i<10; i++){
            for(int j=0; j<10;j++){
                numbers[i][j]=number;
                number++;
                rowsum=rowsum+numbers[i][j];
             System.out.printf("%4d",numbers[i][j]);
            }
            System.out.println("Sum is: "+ rowsum);
            rowsum=0;
            System.out.println();
        }
        for(int i=0; i<10; i++){
            for(int j=0;j<10; j++){
                columnSum=columnSum+numbers[j][i];
            }
            System.out.println(columnSum);
            columnSum=0;
        }
    }
    public static void   printAsTriangle(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                if(j<=i){
                    System.out.println(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
