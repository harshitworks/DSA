package com.harshit.recursion;

public class message_example {
    static void main() {
        message();
        System.out.println("This is after calling the main message function");
    }

    static void message() {
        System.out.println("Hello this is from the message call ");
        message1();
        System.out.println("After the message");

    }
    static void message1() {
        System.out.println("Hello this is from the message 1 call ");
        message2();
    }
    static void message2() {
        System.out.println("Hello this is from the message 2 call ");
        message3();
    }
    static void message3() {
        System.out.println("Hello this is from the message 3 call ");
        message4();
    }
    static void message4() {
        System.out.println("Hello this is from the message 4 call ");

    }










}
