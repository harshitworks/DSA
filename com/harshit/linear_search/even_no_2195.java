package com.harshit.linear_search;

public class even_no_2195 {
    static void main(String[] args) {

       int[] nums={12,234,4566,5544,0};
       int c =0;
       for(int num: nums)
       {
           if(even(len(num)))
           {
               c++;
           }

       }
        System.out.println(c);

    }

    static boolean even(int num) {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }

    static int len(int a) {
        int count=0;
        if(a ==0) {
            return 1;
        }
        while (a>0) {
            count++;
            a/=10;

        }
        return count;
    }
    // 56
}
