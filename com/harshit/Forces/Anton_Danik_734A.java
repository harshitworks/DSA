package com.harshit.Forces;

import java.util.*;
import java.io.*;

public class Anton_Danik_734A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt();
        in.nextLine();
        int a = 0 , d = 0 ;
        String s = in.nextLine();
        for(int i = 0 ; i < n ; i++) {
            char ch = s.charAt(i);
            if(ch=='D') d++;
            else a++;
        }
        if(d>a) {
            System.out.println("Danik");
        }
       else if(a>d) {
            System.out.println("Anton");
        }
        else {
            System.out.println("Friendship");
        }
    }
}