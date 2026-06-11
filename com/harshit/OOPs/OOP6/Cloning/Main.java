package com.harshit.OOPs.OOP6.Cloning;

import java.util.Arrays;

public class Main {

    static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(67 , "Harshit Gaur");

        System.out.println("Created a copy of object using the constructor of class");
        Human t1 = new Human(h1);
        System.out.println(h1.name);
        t1.name = "Name changes for t1";
        System.out.println(t1.name);
        t1.arr[0]= 400;
        System.out.println(Arrays.toString(t1.arr));
        System.out.println(Arrays.toString(h1.arr));


        System.out.println("Cloning using Cloneable interface and clone function");
        Human t2 = (Human)h1.clone(); // h1.clone gives Object type , hence we need to cast it:

        System.out.println(h1.name);
        System.out.println(t2.name);
        t2.name = "Changes";
        System.out.println(t2.name);
        t2.arr[0]= 500;
        System.out.println(Arrays.toString(t2.arr));
        System.out.println(Arrays.toString(h1.arr));

        System.out.println("It can be considered that clone() function and the constructor both are creating shallow copies that is new values is assigned for primitive variables and for non primitive variables they point to the same object or reference int the memory , so changes in one will also affect the other object variables");

        // after manually adding the deep functionality in clone() method, it will creates deep copy
    }
}
