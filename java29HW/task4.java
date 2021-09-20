package Syntax.JavaHomeworks.java29HW;

import java.util.Iterator;
import java.util.TreeSet;

public class task4 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Finland");
        countries.add("Moldova");
        countries.add("Armenia");
        countries.add("England");
        countries.add("Canada");
        countries.add("Bulgaria");
        countries.add("Denmark");
        Iterator<String> list = countries.iterator();
        System.out.println("1st loop");
        while (list.hasNext()) {
            System.out.print(list.next()+", ");
        }
        System.out.println("\n--------------------------------------------");
        System.out.println("2nd loop");
        int counter = 1;
        for (String a :countries) {
            System.out.println(counter+"="+a);
            counter++;
        }
    }
}
