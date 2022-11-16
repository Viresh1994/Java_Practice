package org.example;

public class StaticMethod {

    static void stMethod(){
        System.out.println("Static method can be called without creating object");
    }

    public void pbMethod(){
        System.out.println("public method can be called without creating objects");
    }

    public static void main(String[] args) {
        stMethod();
        StaticMethod sm = new StaticMethod();
        sm.pbMethod();
    }
}
