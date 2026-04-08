package com.harshit.Strings;

public class performance {
    static void main() {
        String series = "";
        for (int i = 0; i < 26; i++) {
//            System.out.print((char)('a'+i));
            char ch = (char)('a'+i);
            series+=ch;

        }
        System.out.println(series);

        // here we are creating new object of name 'series' as strings are immutable therefore strings with 'a' , 'ab' , 'abc' , 'abcd',............... , 'abcdefghijklmnopqrstuvwxy' was created and stored in the memory but now they have not any refernce pointer


        // so creating a string of length 'n' will take O(n*n) time complexity which is very bad,
    }
    
    
    
    
}
