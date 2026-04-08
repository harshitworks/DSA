package com.harshit.maths;

import java.util.ArrayList;

public class factors {
    static void main() {
    int n = 36 ;
     factor(n );
        System.out.println();
     effectiv_factor(n);
        
    }
    static void factor(int n) {
        System.out.print("Factors are: ");
        for (int i = 1; i <= n; i++) {
            if(n%i==0) System.out.print(i+" ");
        }
        
    }


    static void effectiv_factor(int n ) {
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 1; i*i <=n ; i++) {

//            if(n%i==0){
//                if(n/i==i) System.out.println(i);
//                else System.out.print(i+" "+n/i+","); //  it is not printing in sorted order , we can store the unsorted elements and print them later
//            }

            // printing in sorted
                if(n%i==0) {
                    if (n / i == i) System.out.print(i+" ");
                    else { System.out.print(i+" ");  list.add(n / i); }
                }

        }
            for (int j = list.size()-1; j>=0 ; j--) {
                System.out.print(list.get(j)+" ");

            }
    }
    
}
