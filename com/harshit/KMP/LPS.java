package com.harshit.KMP;

import java.util.Arrays;

public class LPS {
    static void main(String[] args) {
        String pattern = "abcdab";
        int[] arr = lps(pattern);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] lps(String pattern) {
        int n =  pattern.length();
        int[] lps = new int[n];
        int i = 0 , len = 0 ;
        lps[i++] = 0;
        while(i < n) {
            if(pattern.charAt(i)==pattern.charAt(len)) {
                len++;
                lps[i]= len ;
                i++;
            }
            else {
                if(len==0) {
                    lps[i]= 0;
                    i++;
                }
                else { // here pattern[i] does not match with pattern[len] , but len > 0 that means till previous index we had a match so we try to match a smaller substring.
                    len = lps[len-1];

                }
            }

        }
        return lps;
    }
}
