package com.harshit.LinkedList.Questions;

import java.util.Arrays;

public class Bubble_sort_recursion {
    static void main(String[] args) {
        int[] arr = {4,5,2,7,2,9};
        bubble_sort_arr(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }



    public static void bubble_sort_arr(int[] arr, int start, int count) {
        if(count==0) return;
        if(count>start) {
            if(arr[start]>arr[start+1]) {
                int temp = arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            bubble_sort_arr(arr,start+1,count);
        }
        else {
            bubble_sort_arr(arr,0,count-1);
        }
    }

    // code for linked list is in the Sinlgy folder in the LL sub folder
}
