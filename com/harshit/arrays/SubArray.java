package com.harshit.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
    static void main(String[] args) {
        int[] arr = { 1, 4, 6, 3,9};
        subarray(arr);
        System.out.println("---------------");
        subarray_sum(arr);
        System.out.println("---------------");
        subarray_optimise(arr);
        System.out.println("---------------");
        subarray_optimise2(arr);

    }
    public static void subarray(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i ; j < n ; j++) {
                for(int k = i ; k <= j ; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void subarray_sum(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++) {
            int sum = 0 ;
            for(int j = i ; j < n ; j++) {
                sum+=arr[j];
                System.out.println(sum);

            }
            System.out.println();
        }
    }

    public static void subarray_optimise(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for(int j = i ; j < n ; j++) {
               list.add(arr[j]);
                System.out.println(list.toString());
            }
                System.out.println();
        }
    }
    public static void subarray_optimise2(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++) {
           String str = "";
            for(int j = i ; j < n ; j++) {
               str+=arr[j];
                System.out.println(str);
            }
                System.out.println();
        }
    }
}

