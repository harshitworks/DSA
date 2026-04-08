package com.harshit.Recursion_G_and_Am_Ques;

import java.util.ArrayList;

public class NumPad {
    static void main(String[] args) {
        String p = "";
        String up = "12";
        numpad(p,up);
        System.out.println(numpad2(p,up));

    }
    static void numpad(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);
        int digit = ch - '0';

        for(int i = (digit-1)*3 ; i< (digit)* 3; i++) {
            char c = (char)(i+'a');
            numpad(p+c, up.substring(1));

        }

    }

    static ArrayList<String> numpad2(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i <digit*3; i++) {
            char chh = (char ) (i+'a');
            ans.addAll(numpad2(p+chh, up.substring(1)));

        }
        return ans;
    }
}
