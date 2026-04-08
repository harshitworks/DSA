package com.harshit.Forces;

import java.util.*;

public class Word_59A {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int l = 0 , u= 0 ;
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length; i++) {
            char ch = arr[i];
            if(ch<='z' && ch>='a') l++;
            else if(ch>='A' && ch<='Z') u++;
        }
        if(l<u) {
            System.out.println(s.toUpperCase());
        }
        else  {
            System.out.println(s.toLowerCase());
        }
    }
}