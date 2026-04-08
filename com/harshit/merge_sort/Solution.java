package com.harshit.merge_sort;

import java.util.Arrays;
class Solution {

    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int pr = 1 ;
        arr1[0]=1 ;
        for(int i = 1 ; i < n; i++) {
            arr1[i]=nums[i-1]*arr1[i-1];
        }
        int[] arr2 = new int[n];
        arr2[n-1]=1 ;
        for(int i = n-2 ; i>=0 ; i--) {
            arr2[i]=arr2[i+1]*nums[i+1];
        }
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i]=arr1[i]*arr2[i];
        }
        return arr;

    }
}
//
//class Solution {
//
//
//    static void main(String[] args) {
////        int[] arr={3,0,1,6,5};
//        int[] arr={1,3,1};
////        int[] arr={11,15};
//        System.out.println(hIndex(arr));
//    }
//
//    public static int hIndex(int[] citations) {
//
//        Arrays.sort(citations);
//        int n= citations.length;
//        if(n==1 && citations[0]>0) return 1;
//        for(int i=0; i<n; i++) {
//            if(n-i <= citations[i]) {
//                return n-i;
//            }
//        }
//        return n;
//    }
//
//}