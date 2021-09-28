package Syntax.JavaHomeworks.java30HW;

import java.util.*;

public class task8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(55);
        list.add(777);
        list.add(666);
        list.add(888);
        list.add(10);
        list.add(55);

        System.out.println(list);
        int sum = 0;
        for (Integer x: list
             ) {
            sum+=x;
        }
        System.out.println(sum);
    }
}
