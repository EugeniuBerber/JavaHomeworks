package Syntax.JavaHomeworks.java30HW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class task3 {
    public static void main(String[] args) {
        Map<Integer,String> bestBuy = new HashMap<>();
        bestBuy.put(7664847, "Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(7823123, "Dryer");
        bestBuy.put(1234, "Gift Card");
        bestBuy.put(5244, "Robot Vacuum");
        bestBuy.put(666, "Bottle of holy water");

        Set<Map.Entry<Integer,String>> bestEntry = bestBuy.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = bestEntry.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> element = iterator.next();
            Integer key = element.getKey();
            String val = element.getValue();
            System.out.println("Product with ID: "+key+" >>--->  "+val);
        }

    }
}
