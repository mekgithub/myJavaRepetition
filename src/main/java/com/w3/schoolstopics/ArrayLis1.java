package com.w3.schoolstopics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLis1 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Porsche");
        cars.add("Toyota");
        Collections.sort(cars);
        for(int i=0;i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        /*System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("o"));
        System.out.println(cars.remove(1));
        //cars.set(0,"Ford");
      //  cars.get(2);*/
    }
}
