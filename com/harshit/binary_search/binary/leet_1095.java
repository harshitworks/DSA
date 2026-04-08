package com.harshit.binary_search.binary;
//
public class leet_1095 {
//    /**
//     * // This is MountainArray's API interface.
//     * // You should not implement it, or speculate about its implementation
//     * interface MountainArray {
//     *     public int get(int index) {}
//     *     public int length() {}
//     * }
//     */
//
//    class Solution {
//        public int findInMountainArray(int target, MountainArray mountainArr) {
//            int start = 0 ;
//            int end = MountainArray.length()-1;
//            int mid = start + (end - start)/2;
//
//            while(start<end)
//            {
//                mid = start + (end - start) / 2;
//                if(mountainArr[mid]>mountainArr[mid+1]) end= mid;
//                else start = mid + 1;
//
//            }
//            int n = start;
////
//
//
//            int start = 0 ;
//            int end = n;
//            while(start<=end) {
//                int mid = start + (end-start)/2;
//
//                if(item>mountainArr[mid])
//                {
//                    start=mid+1;
//                }
//                else if (item<mountainArr[mid]) {
//                    end=mid-1;
//                }
//                else {
//
//                    return (mid+1);
//
//                }
//
//            }
//            return -1 ;
//
//        }
//
//
//    }
}
