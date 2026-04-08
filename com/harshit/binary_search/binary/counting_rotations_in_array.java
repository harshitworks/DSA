package com.harshit.binary_search.binary;

import static com.harshit.binary_search.binary.pivot_sorted_and_duplicates.pivot;


public class counting_rotations_in_array {
    static void main() {
        int[] arr = { 2,2,3,3,5,6,7,4,2};
        int ans = pivot(arr);
        // here we are getting the location of the pivot and then deciding the number rotations have been made to make the  array a rotated array
        if ( ans == arr.length-1) System.out.println("0 Rotations");
        else System.out.println("Rotations " +(ans+1));
    }
}
