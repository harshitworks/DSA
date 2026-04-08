package com.harshit.basics;

import java.util.Arrays;
import java.util.Scanner;

public class firstjavaprogram {

    public static void java() {
        System.out.println("Hello Java user this is a method ");

    }

    public static void main(String[] args) {
        System.out.println("Hello, kitttttttttt");
        String var = "har time mastii 6174 ";
        String kar = var;
        System.out.println(kar);
        byte age = 123;
        int id = 1234567900;
        long id2 = 123456790000L;
        float num = 3.14f;
        System.out.println(num);
        char letter = 'o';
        boolean havebrain = true;
        System.out.println(havebrain);
        System.out.println(var.length());
        String tappu = new String("creating new string using the old string");
        System.out.println(tappu);
        String name3 = var + "here" + letter;
        System.out.println(name3);

        System.out.println(tappu.charAt(6)); // returns the character at specific index
        String rep = var.replace('h', 'b');
        System.out.println(var);
        System.out.println(rep);
        System.out.println(var.substring(0, 3));

        int[] marks = new int[5];
        marks[0] = 12;
        marks[1] = 14;
        marks[2] = 15;
        marks[3] = 10;
        marks[4] = 18;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // System.out.println(marks[5]);
        System.out.println(marks.length); // to get the length or size of the array, we use .length and not .length() as
                                          // it is a property of array.

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] sub = { 12, 24, 36 };
        System.out.println(sub[0]);
        System.out.println(sub[1]);
        System.out.println(sub[2]);

        int[][] finali = { { 12, 24, 36 }, { 13, 26, 39 } };
        System.out.println(finali[0][0]);
        System.out.println(finali[0][1]);
        System.out.println(finali[0][2]);
        System.out.println(finali[1][0]);
        System.out.println(finali[1][1]);
        System.out.println(finali[1][2]);

        int p = 100;
        int k = p + (int) 180.00;
        System.out.println(k);

        final float PI = 3.14f; // final variable or we can say the constants.
        System.out.println(PI);

        int numm = 13;
        System.out.println(numm);
        System.out.println(numm--);
        System.out.println(numm);

        System.out.println(Math.max(34, 67));
        System.out.println(Math.random()); // give a random value in between 0.0 to 0.1
        System.out.println((int) (Math.random() * 100)); // gives random int from 0 to 100

        // taking input from the user
        Scanner sc = new Scanner(System.in); // create an object of Scanner class

        // TAKING STRING INPUT FROM THE USER
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // nextLine() is used to take string input from the user
        System.out.println("Hello " + name);

        // TAKING INTEGER INPUT FROM THE USER
        System.out.println("Enter your age:");
        int agee = sc.nextInt(); // nextInt() is used to take integer input from the user
        System.out.println(agee);

        // taking FLOAT INPUT FROM THE USER
        System.out.println("Enter your cgpa:");
        float cgpa = sc.nextFloat(); // nextFloat is used to take float input from the user.
        System.out.println(cgpa);

        // Comparison operators:
        // ==, != , < , >, <=, >=
        boolean sunup = true;
        if (sunup == true) {
            System.out.println("Its day time");
            System.out.println("lets have some study");
        } else {
            System.out.println("Its Night baby");
        }

        // Logical Operators: && , || , !

        if (age > 18 && sunup == true) {
            System.out.println("Can vote bro");
        } else {
            System.out.println("Cannot vote..baby");
        }

        boolean isadult = false;
        if (!isadult)
            System.out.println("Bro never dies");
        else
            System.out.println("bro is a baby bro");

        // pen =20, pencil=5
        System.out.println("enter the money you have  ");
        int cash = sc.nextInt();
        if (cash < 5) {
            System.out.println("Go to home babu");

        } else if (cash >= 5 && cash < 20) {
            System.out.println("Pencil le jaao");

        } else
            System.out.println("Sab le jao");

        // switch statement or switch case

        int day = 2;
        // 1 for sunday , 2 for monday and so on..

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tue-sat");
                break;

            default:
                System.out.println("Invalid choice");

        }

        // Loops
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }

        // while loop
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        // do- while loop
        int lp = 0;
        do {
            System.out.println(lp);
            lp = lp + 5;
        } while (lp <= 100);

        int lum;
        do {
            System.out.println("Enter your NUmber ");
            lum = sc.nextInt();
            System.out.print("here is your number");
            System.out.println(lum);

        } while (lum >= 0);
        System.out.println("The End");

        int madan = 1;
        while (true) {
            if (madan == 3) {
                madan = madan + 1;
                continue;
            }
            System.out.println(madan);
            madan = madan + 1;
            if (madan > 5) {
                break;
            }
        }
        /// Try and catch in exception handling

        int[] aray = { 1, 2, 3 };
        try {
            System.out.println(aray[5]);
            // we put the code which may generate exception or error in try block
        } catch (Exception e) {
            // we can handle and store the exception in variable e
        }
        System.out.println("Program ended");

        java(); // calling the method java

        // Guess the number game
        System.out.println("Welcome to the Guess the number game ");
        int c=0;
        int cnum = (int) (Math.random() * 100);
        System.out.println("Guess the number between 1 to 100");
        while (true) {

            System.out.println("Type -1 to exit the game or won the game ");
            int mynum = sc.nextInt();
            if (mynum == cnum) {
                System.out.println("Congratulation , You won the game");
                break;
            } else if (mynum > cnum) {
                System.out.println("Your number is large");

            } else if (mynum == -1) {
                System.out.println("You exited the game");
                break;

            } else
             {
                System.out.println("Your number is small");
            }
c=c+1;
        }


System.out.print("You won in ");
System.out.println(c);


    }
}