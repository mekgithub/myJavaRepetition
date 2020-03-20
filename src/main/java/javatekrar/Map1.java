package javatekrar;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map cities = new HashMap();

        cities.put("Houston",100);
        cities.put("New Jersey",200);
        cities.put("New York",300);
        cities.put("New Jersey",400);
        cities.put("Atlanta",500);
        cities.put("California",600);

        //System.out.println(cities.size());//5
        System.out.println(cities);//(New York=300, Atlanta=500, California=600, New Jersey=400, Houston=100}
        //System.out.println(cities.get("Houston"));
      //  System.out.println(cities.entrySet());
        //cities.remove("New Jersey");


    }

}
