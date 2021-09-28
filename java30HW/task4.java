package Syntax.JavaHomeworks.java30HW;

import Syntax.cool.Main;

public class task4 {
    public static void main(String[] args) {
        Person mike =new Person();
        mike.userDetails();
    }
}
class Person{
   private String name;
   private String lastName;
   private int age;
   private double salary;
    Person(){}

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void userDetails(){
        System.out.println("Name: "+name+"\n"+
                            "Last name: "+lastName+"\n"+
                            "Age: "+age+"\n"+
                            "Salary: "+salary);
    }
}