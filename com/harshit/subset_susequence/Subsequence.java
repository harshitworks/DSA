package com.harshit.subset_susequence;

import java.util.ArrayList;

public class Subsequence {

    static void main(String[] args) {
        String up = "abc";
        subseq("",up);
        System.out.println(subseq2("", up));
        System.out.println(subseqascii("", up));
    }

    static void subseq(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subseq2(String p,String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p,up.substring(1));
        ArrayList<String> right = subseq2(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> subseqascii(String p,String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqascii(p,up.substring(1));
        ArrayList<String> right = subseqascii(p+ch,up.substring(1));
        ArrayList<String> third = subseqascii(p+ (ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(third);
        return left;
    }
}
