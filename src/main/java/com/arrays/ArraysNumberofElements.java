package com.arrays;

public class ArraysNumberofElements {
    public static void main(String[] args) {
        String [] myStringArray={"abc","def","asdfg","oiuhgc","uhb","okm","a","bn"};
       int numberOfElements=0;
       String word="";
       for(int i=0; i<myStringArray.length ; i++){
           word=myStringArray[i];
           if(word.length()<4){
               numberOfElements++;

           }
       }
        System.out.println("There are "+numberOfElements+ " strings");

    }
}
