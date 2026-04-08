package com.harshit.binary_search.binary;

public class pivot_sorted_and_duplicates {
    static void main() {
        int[] arr = { 2,2,3,3,5,6,7,4,2};
        int ans = pivot(arr);
        System.out.println(ans);
    }
    static int pivot(int[] arr) {
        int start = 0 ;
        int end  = arr.length-1;

         while(start < end )
         {
             int mid = start + (end- start)/2;

             // 4 cases we will look ;
             /* lets break the array as a b c d ;
             b is the peak element
             c is the smallest element as , it is the element just after the pivot
             a is the left-sorted array containing elements smaller than the pivot and larger than the right side
             d is the right sorted array starting with c and  containing elements smaller than a
              */




             // Case 1 : mid will point to the b
             if (mid < end) {
                 if (arr[mid] > arr[mid + 1])
                     return mid;}

             //  Case 2 : mid will point to c
             if( mid > start) if(arr[mid-1]>arr[mid] ) return mid-1 ;


             // Case 3 : mid is somewhere in a, that means mid >= start
             // if the arr[start] = arr[mid] = arr[end] then remove the duplicates
             if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                 // but be sure before removing the duplicates that either start or end not the peak

                 // when our start will be peak : when it is larger than the element next to it
                 if (arr[start] > arr[start + 1]) return start;
                 start++;   // removing the duplicates.
                 if (arr[end - 1] > arr[end]) {
                     return end - 1;
                 }
                 end--;
             }

             // left part is sorted , pivot is on the right.
             else if(arr[mid]>arr[start] || arr[mid]==arr[start] && arr[mid]> arr[end]) start = mid  + 1;
             // right side is sorted move to left
             else end = mid -1 ;


         }

        return arr.length-1 ;
    }




}
