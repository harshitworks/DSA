package com.harshit.binary_search.binary;

import java.util.Scanner;

public class search {
    // Binary search can be applied to Sorted arrays only, either it is in ascending or descending order
    // Time complexity of binary search is Big o of Logn


    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int item = input.nextInt();
        int[] arr = {12, 24, 36, 48, 60, 72};

        int ans = binarysearch(arr, item);
        if( ans == - 1 ) {
            System.out.println("Item not found in the array");

        }
        else {
            System.out.println(item + " is found at " + ans + " position ");
            System.out.println(ans);
        }
//        int mid=(start+end)/2; // start + end may give a value out of range

    }
static int binarysearch(int[] arr , int item)
        {
        int start = 0;
        int end = arr.length - 1;

    while(start<=end) {
     int mid = start + (end-start)/2;

        if(item>arr[mid])
        {
            start=mid+1;
        }
        else if (item<arr[mid]) {
            end=mid-1;
        }
        else {

            return (mid+1);

        }

     }
return -1;
        }
}
