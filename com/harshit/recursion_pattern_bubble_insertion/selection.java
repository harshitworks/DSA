package com.harshit.recursion_pattern_bubble_insertion;

import java.util.Arrays;

import static com.harshit.sorting.selection_sort.getindex;

public class selection {

    static void main() {
        int[] arr = {12,56,2,69,11,23};
//        sort2(arr,0);
        sort3(arr, arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));

    }

    static void sort2(int[] arr , int a ){
        if(a== arr.length-1) return;
        int i = getindex(arr,0, arr.length-1-a);
        swap(arr,i, arr.length-1-a);
        sort2(arr,a+1);


    }
    static void swap(int[] arr, int a , int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }




    // using the row and col , for counting the iteration till end we have the condtion r>= c , after the condition fails that means we had reached till the end of the array and got the max element
    static void sort3(int[] arr, int r, int c, int max) {
        if(r==0) return ;
        if(r>=c) {  // this is how we are iterating over the arrat and finding the max index
             if(arr[c]>arr[max]) sort3(arr,r,c+1,c);
             else sort3(arr,r,c+1,max);
         }
         else {
             swap(arr,max,r);
             sort3(arr,r-1,0,0);
         }
    }


}
