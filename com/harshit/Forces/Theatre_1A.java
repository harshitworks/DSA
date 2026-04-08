package com.harshit.Forces;

import java.util.Scanner;

public class Theatre_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long a =  sc.nextLong();
        long k = m/a;
        if(m%a!=0){
            k++;
        }
        long l = n/a;
        if(n%a!=0){
            l++;
        }
        long ans = k * l ;
        System.out.println(ans);
    }
}