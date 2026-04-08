package com.harshit.Strings;

public class palindrome_string {
    static void main() {
        String str = null;
        System.out.println(pal(str));
    }

    static boolean pal(String str) {
        if(str==null|| str.isEmpty()) return true;

        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i); 
            char end = str.charAt(str.length()-1-i);
            if( start !=end) return false;

        }
        return true;
    }
}

