package com.harshit.OOPs.OOP7;
import java.util.*;
public class Main {

    enum Color implements Test {
        RED, BLUE, GREEN, YELLOW;

        public void fun() {
            System.out.println("Hello "+this+ ", enums can implements interfaces too");
        }
    }
    static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(8);
        System.out.println(list);

        // Since vectors are synchronized they are slower than ArrayList:
        List<Integer> vec = new Vector<>();
        vec.add(5);
        vec.add(6);
        System.out.println(vec);

        for(Color c: Color.values()) {
            System.out.println(c);
            System.out.println(c.ordinal());  // returns the index value of the object inside
        }
        Color.RED.fun();



    }

}
