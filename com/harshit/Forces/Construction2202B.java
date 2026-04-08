package com.harshit.Forces;

import java.util.*;
import java.lang.*;

    public class Construction2202B {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            input.nextLine();
            while (t-- > 0) {
                int n = input.nextInt();
                input.nextLine();
                String s = input.nextLine();
                fun(s);
            }
        }



//        public static char get(int x) {
//            return (x % 2 == 0) ? 'a' : 'b';
//        }
//
//        public static void fun(String s) {
//            int n = s.length();
//            int leftTaken=0;
//            int rightTaken=0;
//            int i = 0;
//            while (i < n) {
//
//                char ch = s.charAt(i);
//                char L = get(leftTaken);
//                char R = get(n - 1 - rightTaken);
//
//                if (ch == L) {
//                    leftTaken++;
//                }
//                else if (ch == R) {
//                    rightTaken++;
//                }
//                else if (ch == '?') {
//                    leftTaken++;
//                }
//                else {
//                    System.out.println("NO");
//                    return;
//                }
//                i++;
//
//            }
//            System.out.println("YES");
//        }
        public static void fun(String s) {
    int n = s.length();
    if (check(s, 'a') || check(s, 'b')) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
}

        public static boolean check(String s, char start) {
            for (int i = 0; i < s.length(); i++) {  // won't compile, pass n
                char expected = (i % 2 == 0) ? start : (char)(start == 'a' ? 'b' : 'a');
                char ch = s.charAt(i);
                if (ch != '?' && ch != expected) return false;
            }
            return true;
        }
}
