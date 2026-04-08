package com.harshit.sorting;

import static com.harshit.sorting.cyclic_sort_0_to_n.cyclic_sort2;

public class leet_268 {
    static void main() {
        int[] arr = {5, 1, 2, 0, 4};
        cyclic_sort2(arr); // now we have a sorted array.
        System.out.println(missing_element(arr));
    }

    // search for the missing element
    static int missing_element(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i) return i;
        }
        return -1 ;
    }
}
