package com.harshit.Forces;
import java.util.*;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n  = input.nextLong();
        long ans = n/5 ;
        if(n%5!=0){
            ans++;
        }
        System.out.println(ans);
    }
}