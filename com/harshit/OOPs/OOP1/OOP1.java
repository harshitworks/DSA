package com.harshit.OOPs.OOP1;

public class OOP1 {
    static void main(String[] args) {
    Student s1 = new Student();
        System.out.println(s1.name);       // this will  print the value given inside the  constructor  as it is called
        s1.display();
        s1.name="Hello there";
        System.out.println(s1.name);      // this will print the updated value of the object
        System.out.println(s1.rn);
        System.out.println(s1.marks);



        // so we had created two constructor inside the class one with three parameters and another without any parameter that is non-parameterized, so when we will create an object it will call to that constructor which matches the size of parameters 0 or 3 .
        Student s2 = new Student(112, "ha", 67f);
        System.out.println(s2.rn);
        System.out.println(s2.name);
        System.out.println(s2.marks);


        Student passed = new Student(s2);    // created an object using or passing other object
        passed.display();

        s2.display();


        // dynamically allocating one reference to another
        Student one = new Student();
        Student two = one ;

        one.name = "Dikshit Chauhan";
        System.out.println(two.name);
        two.name="name change using the same reference";
        System.out.println(one.name);

    }


    }

class Student {
    int rn;
    String name;
    float marks;


    void display() {
        System.out.println("The name of the person is "+this.name+" and roll no:"+this.rn+" and got "+this.marks);
    }


//    Student () {                                     // constructor without parameter
//        this.name= "Harshit Gaur";
//        this.rn= 111;
//        this.marks= 99f;
//    }

    Student () {
        this (12, "abc", 64f);         // calling a constructor within a cosntructor, so when we create an object without any parameter it will call to this constructor and this  cosntructor will call the constructor having three parameters .
    }

    Student (int roll , String naam, float marks) {                // constructor with parameters
        this.rn= roll;
        this.marks= marks;
        this.name=naam;
    }

    Student (Student other) {                       // here we are passing another object to the constructor
        this.rn= other.rn;
        this.marks= other.marks;
        this.name=other.name;
    }

    class A {
        String name ;


        A () {
            this.name= "Hello";
        }


//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("Object is Destroyed automatically to free resources");
//        }


    }





}
