package org.example;

public class Student {

    int rollno;
    String name;
    static String college="ITIS";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display(){
        System.out.println(rollno+ " "+name+ " "+college);
    }
}
