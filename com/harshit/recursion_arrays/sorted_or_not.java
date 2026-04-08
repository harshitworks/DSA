package com.harshit.recursion_arrays;

public class sorted_or_not {
    static void main() {
        int[] arr = {1,2,3,4,5,6,8,7};

        System.out.println(sort(arr));

    }

    static boolean sort(int[] arr ) {
        return helper(arr,0);
    }

    // as there is requirement of another parameter that is c , which is intially 0 but increase with every function call therefore we create a helper function just to call the function with c = 0 afterwards value of c will increase recursively.

    static boolean helper(int[] arr , int c) {
        if(c== arr.length-1) return true;
        if(arr[c]<arr[c+1]) return helper(arr, c+1);
        else return false ;
    }
}
