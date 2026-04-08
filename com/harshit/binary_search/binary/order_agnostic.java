package com.harshit.binary_search.binary;

public class order_agnostic {
    // Before applying the Binary search we should know either the array is sorted in ascending or descending
// we just check first and last element and compare their values to get ascending or descending
    static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int start = arr[0];
        int end= arr.length-1;
        if (start > end)
        {
            System.out.println("Descending");
        }
        else
        {
            System.out.println("Ascending");
        }
    }



}
