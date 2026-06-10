package com.harshit.OOPs.OOP6.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Calculator sum = (a,b) -> a+b;
        Calculator sub = (a,b) -> a-b;
        Calculator mul = (a,b) -> a*b;
        Calculator divide = (a,b) -> a/b;

        System.out.println(sum.operation(4,5));
        System.out.println(sub.operation(4,5));
        System.out.println(mul.operation(4,5));


        // Storing the function definition in a interface and then passing it to
        Consumer< Integer> fun = x -> System.out.println(x*2);
        list.forEach(fun);




    }

}
interface Calculator {
    int operation(int a , int b);
}
