package com.company;

public class Person {

    String name;
    int age;


    public Person (String name, int age){
        this.name = name;
        this.age = age;

    }

    public Person getPerson(){
        return this;
    }

    public static void foo () {
        System.out.println("Static");

    }

    public void woAmI () {
        System.out.println("My name is " + name);

    }

    public int getAge()    {
        return age;
    }
}
