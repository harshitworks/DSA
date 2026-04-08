package com.harshit.recursion;

import java.util.Arrays;
class reverse_an_array {

    static void main() {
        int[] nums = {1,2,3,4,5,6,7};
        int k= 3;
            reverse(nums,0,nums.length) ;
            reverse(nums,0,k);
            reverse(nums,k,nums.length);
        System.out.println(Arrays.toString(nums));


        }


        static void reverse(int[] arr,int start, int k) {
            for (int i = start; i < (k+start)/2; i++) {
                int temp = arr[i];
                arr[i]=arr[k+start-1-i];
                arr[k+start-1-i]=temp;

            }
        }


    }


