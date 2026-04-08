package com.harshit.quick_sort;

import java.util.Arrays;

import static com.harshit.recursion_pattern_bubble_insertion.bubble.swap;


public class Quick_Sort {

    static void main() {
        int[] arr = {5,-98,4,3,87,65,2,1,-34};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick_sort(int[] arr, int low,int hi) {
        if(low>=hi) return;
        int start = low ;
        int end = hi ;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

         while(start<=end) {

             while(start<=end && arr[start]<pivot) {
                 start++;
             }
             while(start<=end && arr[end]>pivot) {
                 end--;
             }
             // till now we will get the start and end which are violating the pivot condition therefore we need to swap the position of start element and end element , here we will do them in a one go , that is currently element which is lesser than pivot is on the right side and element greater than pivot is on the left side we have to do the vice versa of this.
             // we will swap them ..which will do what we need , but the only condition is to check if our start violate the condition but it is already on the right side, that means correct position
             if(start<=end) {
                 swap(arr, start , end);
                 start++;
                 end--;
             }


         }
         quick_sort(arr,low,end);
         quick_sort(arr,start,hi);

    }

}


