package com.arrays;

public class SplitArrray2 {
    public static void main(String[] args) {
        int [] myArr={1,2,3,4,5,6,7,8,9,10};
        int arrLength=myArr.length;
        int halfLentgh=arrLength/2;
        int [] array1=new int[halfLentgh];
        int [] array2=new int[halfLentgh];
        int index=0;

        for(int i=0;i<arrLength; i++){
            if(i<halfLentgh){
                array1[index]=myArr[i];
            }
            else {
                array2[index]=myArr[i];
            }
            index++;
            if(index>=halfLentgh){
                index=0;
            }
        }
        for(int i=0;i<halfLentgh;i++){
            System.out.print(array1[i]);
        }
        System.out.println();
        for(int j=0;j<halfLentgh;j++){
            System.out.print(array2[j]);
        }
    }
}
