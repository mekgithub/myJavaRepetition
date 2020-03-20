package com.w3.schoolstopics;

import java.util.HashMap;

public class HashMAP1 {
    public static void main(String[] args) {
        HashMap<String,String> cities=new HashMap<String, String>();
        cities.put("England","London");
        cities.put("Turkey","Balikesir");
        cities.put("USA","New Jersey");
        cities.put("Canada","Toronto");
       /* System.out.println(cities);
        System.out.println(cities.get("England"));
        System.out.println(cities.get("Turkey"));*/
        for(String i: cities.values()){
            System.out.println(i);

        }
    }
}
