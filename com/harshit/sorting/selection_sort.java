package com.harshit.sorting;

import java.util.Arrays;

public class selection_sort {
    static void main() {
        int[] arr = {45, 56, 78, 87, 0, -45, -80};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

  public static int getindex(int[] arr, int start, int end) {
          int max = start  ;
      for (int i = start; i <= end ; i++) {
          if(arr[i]>arr[max]) max = i;
      }
      return max;
  }

    static int[] selection_sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
        int max = getindex(arr, 0, arr.length-1-i);
        // just swap two numbers
        int temp = arr[arr.length-1-i];
        arr[arr.length-1-i]=arr[max];
        arr[max]=temp;


        }


        return arr;
    }


}
