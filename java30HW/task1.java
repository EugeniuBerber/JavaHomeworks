package Syntax.JavaHomeworks.java30HW;

import java.util.TreeMap;

public class task1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> building = new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Netflix");
        building.put(4, "Amazon");
        building.put(1, "Google");
        building.put(6, "Apple");
        building.put(7, "IBM");

        System.out.println(building);
        System.out.println(building.size());
        building.replace(4, "Oracle");
        building.remove(7);
        System.out.println(building);
    }
}
