package com.harshit.Forces;

import java.util.*;

public class Wrong_Subtraction977A {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        while(k-->0) {
            int last = n % 10 ;
            if(last==0) n/=10;
            else n--;
        }
        System.out.println(n);
        
    }
}