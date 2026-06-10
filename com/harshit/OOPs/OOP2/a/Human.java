package com.harshit.OOPs.OOP2.a;

public class Human {
    int age;
    String name ;
    int salary;
    boolean married ;
    static int pop;


    // create a constructor by the shorcut Alt+ Insert
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.pop = pop+1 ;            // count the number of objects of a class and increase the value according to it
    }




}
