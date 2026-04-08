package com.harshit.OOPs.OOP3.Inheritance;

public class Main {

    static void main(String[] args) {
        Box obj = new Box();
        obj.display();
//        obj.greeting();     // this also works but we should not use object with object independent methods
        Box.greeting();


        Box obj2 = new Box(5);
        obj2.display();

        Box obj3 = new Box(2,4,5);
        obj3.display();

        Box obj4 = new Box(obj3);
        obj4.display();

        BoxWeight obj5 = new BoxWeight(3,6,8,2);
        System.out.println(obj5.weight);
        obj5.display();

        BoxPrice obj6 = new BoxPrice();
        System.out.println(obj6.l);
        System.out.println(obj6.weight);
        System.out.println(obj6.h);
        System.out.println(obj6.price);

        BoxColor obj7 = new BoxColor("Red");
        System.out.println(obj7.weight);
        System.out.println(obj7.color);


        // static methods cannot be overridden but can be inherited

        // here we inherited the method in child class and calling it using the child class object
        BoxWeight obj9 = new BoxWeight();
        obj9.greeting();

        // here we are trying to overide it
        Box obj8 = new BoxWeight();
        obj8.greeting();    // prints the original function and does not overide it with the function in BoxWeight
        Box.greeting();


    }


}
