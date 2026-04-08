package com.harshit.subset_susequence;

public class skipping_sequence {
    static void main(String[] args) {
        skip("", "adffbfa");
        System.out.println(skip2("asdffsaa"));
        System.out.println(skipapple("aokapplehd"));
        System.out.println(skip_app_not_apple("harahsappjgaappleappdfapplead"));

    }

    static void skip(String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if(ch=='a') {
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));

        }
    }

    static String skip2(String up) {
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a') {
           return skip2(up.substring(1));
        }
        else {
            return ch+skip2(up.substring(1));

        }


    }
    static String skipapple(String up) {
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple")) {
            return skipapple(up.substring(5));
        }
        else {
            return up.charAt(0)+skipapple(up.substring(1));
        }

    }
    static String skip_app_not_apple(String up) {
        if(up.isEmpty()) {
            return "";
        }
        if( up.startsWith("app") && !(up.startsWith("apple"))) {
            return skip_app_not_apple(up.substring(3));
        }
        else {
            return up.charAt(0)+skip_app_not_apple(up.substring(1));
        }

    }



}
