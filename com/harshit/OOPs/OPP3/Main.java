package com.harshit.OOPs.OPP3;

import java.sql.SQLOutput;

public class Main {
    static void main(String[] args) {
        Box box1 = new Box(1,2,3);
        System.out.println(box1.l);
        System.out.println(box1.h);

        System.out.println("------------------");
        BoxWeight bw = new BoxWeight();
        System.out.println(bw.b);
        System.out.println(bw.weight);
        System.out.println(bw.h);
        System.out.println("------------------");
        Box bw2 = new BoxWeight();
        // here we had created a object of Child class type give the reference type of parent class, so the reference type decide the access modifiers but values are printed of child class
//        System.out.println(bw2.weight);  // give error because the parent class the does not have any weight property
        System.out.println(bw2.h);
        System.out.println(bw2.l);
        box1.display();

        bw.display();

        bw2.display();
        // will execute the code in the child class , as the object is type of child , but keep in mind it is referencing the parent , so if it is not present in the parent class, we cannot access it , as access modifiers are determined by the parent class


//        Conclusion :  Reference type check the availability and accessbility of the property and Object type determine what values and code gonna execute, it is not present in the object type then reference type will execute
//        If a method is not present in the child class then , everything access is valid , from parent, child, parent-child
//         If a method is not present in the parent class then it belongs to the child class only and the object of child class and reference type of child class can access it
        // neither the parent class object nor its reference can access it


        // create a  object of Boxprice
        BoxPrice bp = new BoxPrice(1,2,3,4,5);
        System.out.println(bp.b);
        // create an object of Box using the Boxprice object;

        Box box3 = new Box(bp);
        box3.l= 100;
        System.out.println(box3.l);


        ///  creating and object of Box height
        BoxHeight bh = new BoxHeight();
        System.out.println(bh.height);

        // 1 : 10 , WILL TALK ABOUT POLYMORPHISM


    }
}
