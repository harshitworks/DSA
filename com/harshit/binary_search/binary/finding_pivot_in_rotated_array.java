package com.harshit.binary_search.binary;

public class finding_pivot_in_rotated_array {
    static void main() {
//        int[] arr = {6,8,10};
//         int[] arr = {5, 6, 7, 1, 2, 3, 4};
         int[] arr ={1,3,5,8};

        int start , end ;
        System.out.print("The pivot or the peak value is at index: "+ pivot(arr,  start = 0,end = arr.length-1));

    }
    static int pivot(int[] nums, int start , int end) {
        if(nums[start]<nums[end]) return end ;
        while(start<end) {
             int mid = start + (end- start)/2;
            if (mid < end) {
                if (nums[mid] > nums[mid + 1])
                    return mid;
            }

            if( mid > start) {
                if(nums[mid-1]>nums[mid] )
                    return mid-1 ;
            }
             if(nums[start]>=nums[mid]) end = mid-1 ;
             else start = mid + 1 ;
         }

         return nums.length-1;
    }









}
