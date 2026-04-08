package com.harshit.recursion_pattern_bubble_insertion;

import java.util.Arrays;



public class bubble {

    static void main() {
            int[] arr = {12,56,2,69,11};
            sort1(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort1(int[] arr,int count, int start) {

        if(count==0) return ;

        if(count>start)
        {
            if(arr[start]>arr[start+1]) {
                swap(arr, start , start+1);
            }
            sort1(arr,count,start+1);
        }
        else {
            sort1(arr,count-1,0);     // here count is working as a counter , for the comparisons to be made within a particular pass
        }


    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
