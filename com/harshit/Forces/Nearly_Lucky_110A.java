package com.harshit.Forces;

import java.util.*;

public class Nearly_Lucky_110A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a  = input.nextLong();
        String s = String.valueOf(a);
        int n = s.length();
        int c = 0;
        for(int i = 0; i < n ; i++) {
            if(s.charAt(i)=='4' || s.charAt(i)=='7') c++;
        }
        boolean flag = true;

        String s2 = String.valueOf(c);
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i)!='4' && s2.charAt(i)!='7')
            {
                flag = false;
                break;
            }

        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}