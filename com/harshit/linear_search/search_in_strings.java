package com.harshit.linear_search;

import java.util.Arrays;

public class search_in_strings {
    static void main(String[] args) {
String name="Harshit Gaur";
char target = 'r';
        System.out.println(search(name, target));
        System.out.println(search(name, 'p'));
        System.out.println(search2(name, 's'));
        System.out.println(Arrays.toString(name.toCharArray()));   // convert the string to array of characters



    }
    static boolean search(String name, char target) {
    if(name.length()==0)
    {
        return false;
    }
        for (int i = 0; i < name.length(); i++) {
            if(target== name.charAt(i))
            {
                return true;
            }
        }
            return false;
    }

    static boolean search2(String name, char target) {
    if(name.length()==0)
    {
        return false;
    }
        for (char ch: name.toCharArray()) {
            if(target== ch)
            {
                return true;
            }
        }
            return false;
    }






}
