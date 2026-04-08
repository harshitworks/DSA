package com.harshit.OOPs.OPP2.a;

public class InnerClasses {

     static class Test {
        String name;

        public Test(String name) {       // this is constructor created using ALt + Insert
            this.name = name;
        }
        void display() {
            System.out.println("This is a class inside a another class using the object "+this.name);
        }
    }

    static void main(String[] args) {


        Test a = new Test("Abhishek ");
        Test b = new Test("Dikshit ");
        System.out.println(a.name);
        System.out.println(b.name);
        b.display();
    }
}
