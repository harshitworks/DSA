package com.harshit.permutations;

import java.util.ArrayList;

public class Permutation {
    static void main(String[] args) {
        String up = "abc";
        String p = "";
        System.out.println(per(p,up));


    }
    static ArrayList<String> per(String p , String up ) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0 ; i < p.length() + 1 ;i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());    // ch will be inserted somewhere in between f and l
            ans.addAll(per(f+ch+l, up.substring(1)));

        }
        return ans;
    }
}
