package com.harshit.sorting;

import java.util.Arrays;

public class bubble_sorting {
    static void main() {
        int[] arr = { 45, 56 ,78, 87, 0, -45, -80} ;
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static int[] bubble_sort(int[] arr) {
        boolean swap ;
        for (int i = 0; i < arr.length-1; i++) {
            swap = false ;

            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    swap = true ;
                }
                /// here if the array is already sorted then no swapping will occur and therefore swap =false , and no iteration of i should run therefore we will break the loop

            }
                if(swap==false) break;

        }
        return arr ;
    }



}
