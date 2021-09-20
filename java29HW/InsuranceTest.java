package Syntax.JavaHomeworks.java29HW;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
    public static void main(String[] args) {
        ArrayList<Insurance> obj = new ArrayList<>();
        obj.add(new Car("Progressive","Lincoln Town Car"));
        obj.add(new Pet("Geico", "Elephant"));
        obj.add(new Health("AllState"));
        System.out.println("1st loop");
        for (int i = 0; i < obj.size(); i++) {
            obj.get(i).getQuote();
            obj.get(i).cancelInsurance();
            System.out.println("-------------------------------------------------");
        }
        System.out.println("2nd loop");
        for (Insurance element : obj) {
            element.getQuote();
            element.cancelInsurance();
            System.out.println("--------------------------------------------------");
        }
        System.out.println("3rd loop");
        Iterator<Insurance> list = obj.listIterator();
        while (list.hasNext()){
           Insurance element = list.next();
            element.getQuote();
            element.cancelInsurance();
            System.out.println("----------------------------------------------------");
        }

    }
}

