package Syntax.JavaHomeworks.java29HW;

import java.util.HashSet;

public class task6 {
    public static void main(String[] args) {
        HashSet<Student> student = new HashSet<>();
        student.add(new Student("Eugene",999999999999999999L));
        student.add(new Student("Andrei",22));
        student.add(new Student("Olena",666));
        student.add(new Student("Serge", -1));
        student.add(new Student("Asghar", -666));
        student.add(new Student("Mozzam", 55));
        student.add(new Student("Maria", 2));
        for (Student x:student) {
            System.out.println(x.name);
        }
    }
}
class Student{
    String name;
    long studentID;

    public Student(String name, long studentID) {
        this.name = name;
        this.studentID = studentID;
    }
}