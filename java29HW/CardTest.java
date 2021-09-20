package Syntax.JavaHomeworks.java29HW;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {
    public static void main(String[] args) {
        LinkedList<Card> banks = new LinkedList<>();
        banks.add(new Chase("Visa"));
        banks.add(new WellsFargo("MasterCard"));
        banks.add(new TDBank("Visa"));
        System.out.println("1st loop");
        for (int i = 0; i < banks.size(); i++) {
            banks.get(i).info();
            System.out.println("-------------------------------------------------");
        }
        System.out.println("2nd loop");
        for (Card obj: banks) {
            obj.info();
            System.out.println("-------------------------------------------------");
        }
        System.out.println("3d loop");
        Iterator<Card> list = banks.iterator();
        while (list.hasNext()){
            list.next().info();
            System.out.println("-------------------------------------------------");
        }
    }
}
