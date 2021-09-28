package Syntax.JavaHomeworks.java30HW;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class task5 {
    public static void main(String[] args) {
        Map<String, Integer> cities = new TreeMap<>();
        cities.put("Paris", "Paris".length());
        cities.put("Moscow", "Moscow".length());
        cities.put("Washington DC","Washington DC".length() );
        cities.put("New York City", "New York City".length());
        cities.put("Budapest", "Budapest".length());
        Collection<Integer> cityList = cities.values();
        cityList.removeIf(size -> size > 7);
        System.out.println(cities);
    }
}
