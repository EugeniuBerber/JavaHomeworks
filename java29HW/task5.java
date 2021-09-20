package Syntax.JavaHomeworks.java29HW;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class task5 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Denver");
        cities.add("Amsterdam");
        cities.add("New York");
        cities.add("Seattle");
        cities.add("Missoula");
        cities.add("Ankara");
        cities.add("Orlando");
        cities.add("Astana");
        cities.add("Ahmedabad");

        cities.removeIf(x->x.startsWith("A"));
        Iterator<String> list = cities.iterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }

    }
}
