package com.harshit.merge_sort;

import java.util.Arrays;
// now we do not have to create a new array everytime , use the original array in every run i.e. Inplace sorting.
public class merge_sort_effective {
    static void main() {
        int[] arr = {12, 56, 2, 69,2, 11, 23};
        merge_sort2(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }

static void merge_sort2(int[] arr, int start, int end) {
    if(end-start==1) return ;
    int mid = start+ (end-start)/2 ;
    merge_sort2(arr,start,  mid);
    merge_sort2(arr,mid, end);

    merge_InPlace(arr,start,mid, end);

}
static void merge_InPlace(int[] arr, int start, int mid , int end) {
    int[] mix = new int[end-start];

    int i = start;
    int j = mid ;
    int k = 0 ;
    while (i < mid && j < end) {

        if (arr[i] >= arr[j]) {
            mix[k] = arr[j];
            j++;
        } else {
            mix[k] =arr[i];
            i++;
        }
        k++;
    }
    while (i < mid) {
        mix[k] = arr[i];
        i++;
        k++;
    }
    while (j < end) {
        mix[k] = arr[j];
        j++;
        k++;
    }
    for (int l = 0; l < mix.length; l++) {
        arr[start+l]=mix[l];

    }


}
    }