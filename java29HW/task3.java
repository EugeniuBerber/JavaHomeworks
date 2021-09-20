package Syntax.JavaHomeworks.java29HW;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> noDublicates = new LinkedHashSet<>(aList);
        System.out.println(noDublicates);

    }
}
