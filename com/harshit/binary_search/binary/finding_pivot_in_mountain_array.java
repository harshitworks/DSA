package com.harshit.binary_search.binary;

public class finding_pivot_in_mountain_array {

    static void main() {
        int[] arr = { 1 ,4 ,5, 7, 4, 2 };
        int start = 0 ;
        int end = arr.length-1;
        int mid = start + (end - start)/2;

        while(start<end)
        {
            mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]) end= mid;
            else start = mid + 1;

        }
        int n = start;
        System.out.println(n);
    }
}
