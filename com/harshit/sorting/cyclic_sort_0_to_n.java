package com.harshit.sorting;
import java.util.Arrays;
import static com.harshit.sorting.cyclic_sort.swap;

public class cyclic_sort_0_to_n {
    // if we miss an element then it will sort the array till index of missing element .
    static void main() {
        int[] arr = {5,1,2,0,4,3};
//        int[] arr= {4,3,2,7,8,2,3,1,0};
        cyclic_sort2(arr);

        System.out.println(Arrays.toString(arr));
    }

static void cyclic_sort2(int[] arr) {
    int i =0 ;
    while(i < arr.length) {
        int correct = arr[i] ; // here we are initializing the correct index of the element.
        if(arr[i]< arr.length && arr[i]!=arr[correct]) // we should compare the element at its correct position not the index.
             swap(arr, i, correct);
        else i++;

    }
}



}
