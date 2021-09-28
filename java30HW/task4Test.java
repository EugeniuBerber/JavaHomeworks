package Syntax.JavaHomeworks.java30HW;

import java.util.*;

public class task4Test {
    public static void main(String[] args) {
        Map<Integer, Person> persons = new TreeMap<>();
        persons.put(11, new Person("Keanu","Reeves",57, 2000000.0));
        persons.put(4, new Person("John", "Malkovich ", 67,5000000.0));
        persons.put(8,new Person("Tim","Curry", 67,1000000.0));
        persons.put(2, new Person("Tom", "Cruise", 59,50000000.0));

        Collection<Person> obj = persons.values();
        for (Person person : obj) {
            person.userDetails();
            System.out.println("****************************************************************");
        }

    }
}
