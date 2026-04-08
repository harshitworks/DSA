package com.harshit.sorting;

import java.util.Arrays;

public class cyclic_sort {
    static void main() {
//        int[] arr = {7,1,6,5,3,2};
//        int[] arr = {4,3,2,7,8,2,3,1};
//        int[] arr= {4,7,8,2,3,1,5,6};
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(Arrays.toString(cyclic_sort(arr)));
    }

    static int[] cyclic_sort(int[] arr) {
        int i =0 ;
        while(i < arr.length) {
            int correct = arr[i]-1 ;
            // if in our array a number is missing then , length is not equals to  largest element then there will be a case of Index out of bound when we try to allocate the largest element therefore we have to mention the arr[i] < arr.length condition ,
            // if our array has missing number and  duplicates values but the length = largest element then no need of && condition ..same algorithm as normal cyclic sorting
            if( arr[i]!=arr[correct]) swap(arr, i, correct);   // here we're checking that the particular element is at the correct index or not , if not then swap..with its correct index
            else i ++;
// another way is to check the ith element with its correct index element whether they are equal or not .. like arr[i]!= arr[arr[i]-1]

        }
        return arr;
    }

    static void swap(int[] arr, int i , int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }






}
