package com.harshit.OOPs.OOP6.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 0 ;
        try{
           int ans = divide(a,b);
            System.out.println(ans);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter your name ");

        String name = new Scanner(System.in).nextLine();

        try {
            if(name.equals("harshit")) {
                throw new MyException("Ohh my God, you are using my name");
            }
        } catch(MyException e) {
            System.out.println(e.getMessage());
        }


    }
    public static int divide(int a, int b) throws ArithmeticException {
        if(b==0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a/b;
    }
}
