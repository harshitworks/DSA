package com.harshit.sorting;

import java.util.Arrays;

public class insertion_sort {
    static void main() {
        int[] arr = { 45,63,-84,0,256,74};
        System.out.println(Arrays.toString(insertion_sort(arr)));

    }
    static int[] insertion_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1 ; j > 0  ; j--) {
                if(arr[j]<arr[j-1]) { int temp = arr[j] ; arr[j]=arr[j-1]; arr[j-1]=temp;}
                else break; }
        }
        return arr;
    }



}
