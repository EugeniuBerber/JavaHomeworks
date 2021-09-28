package Syntax.JavaHomeworks.java30HW;
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Armenia", "Yerevan");
        countries.put("Georgia", "Tbilisi");
        countries.put("Bulgaria", "Sofia");
        countries.put("Poland", "Warsaw");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Italy", "Rome");
        countries.put("Moldova", "Chisinau");
        countries.put("Ukraine", "Kiev");
        System.out.println("-----------------With Foreach-----------------");
        Set<Map.Entry<String, String>> countryEntry = countries.entrySet();
        for (Map.Entry<String, String> obj : countryEntry) {
            System.out.println(obj.getKey()+"-----"+obj.getValue());
        }
        System.out.println("-----------------With Iterator-----------------");
        Iterator<Map.Entry<String,String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> element = iterator.next();
            String key = element.getKey();
            String value = element.getValue();
            System.out.println(key+"-----"+value);
        }
        System.out.println("-----------------Printing just values with foreach-----------------");
        Collection<String> countryVal = countries.values();
        for (String element : countryVal) {
            System.out.println(element+" ");
        }
        System.out.println("-----------------Printing just values with iterator-----------------");
        Iterator<String> iterator1 = countryVal.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next()+" ");
        }

    }
}
