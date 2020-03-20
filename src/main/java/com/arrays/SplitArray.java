package com.arrays;
//java day 26,video 01:11:00
public class SplitArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int lengthArray = myArray.length;
        int halfLength = lengthArray / 2;//to sub array initilizatiton
        int index = 0;//to be able to reset index numbers

        int[] array1 = new int[halfLength];
        int[] array2 = new int[halfLength];
        for (int i = 0; i < lengthArray; i++) {
            if (i < halfLength) {//to put values array1
                array1[index] = myArray[i];

            }
            else {//to put values array 2
                array2[index] = myArray[i];
            }
            index++;
            //if you reached half length reset the counter
            if (index >=halfLength) {
                index = 0;
            }
        }//print array1
        for(int i=0; i<halfLength; i++){
            System.out.print(array1[i]);
        }//print array2
        System.out.println();
        for(int j=0; j<halfLength ; j++){
            System.out.print(array2[j]);

        }
    }
}
