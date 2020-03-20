package javatekrar;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set cities=new HashSet();

        cities.add("Houston");
        cities.add("New Jersey");
        cities.add("New York");
        cities.add("New Jersey");
        cities.add("Atlanta");
        cities.add("California");

       System.out.println(cities.size());
        System.out.println(cities);

    }
}
