package com.arrays;

public class ArrayReversedCities {
    public static void main(String[] args) {
        String [][] cities= {
                {"newyork", "Atlanta","Alabama"},
                {"Houston", "Stafford","Sanfransisco"},
                {"Austin", "Boston","Pensilvanya","Colorado"}};
        printCitiesFirstLetterA(cities);

    }
    public static void printCitiesFirstLetterA(String[][] cityNames){
       for(int i=0;i<cityNames.length;i++){
           for(int j=0;j<cityNames[i].length;j++){
               String city=cityNames[i][j];
               if(city.charAt(0)=='A'){
                   System.out.println(cityNames[i][j]);
               }
           }
       }
    }
}
