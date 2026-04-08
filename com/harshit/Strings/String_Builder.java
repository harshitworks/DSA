package com.harshit.Strings;

public class String_Builder {
    static void main() {
        StringBuilder s = new StringBuilder("Harshit");
        System.out.println(s);
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            s.append(ch);                   // here everytime it will not create a new object like strings but .. it will update the same object , and takes O(n) complexity for creating a string for length n.

        }
        s.reverse();
        StringBuilder t = new StringBuilder();
        t.append("Hello");
        t.replace(0, 4,"4");
        System.out.println(t);
        System.out.println(s);
        System.out.println(s.toString());        // we can convert the StringBuilder to String


    }



}
