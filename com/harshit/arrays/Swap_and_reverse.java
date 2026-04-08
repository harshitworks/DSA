package com.harshit.arrays;

import java.util.Arrays;

public class Swap_and_reverse {
    static void main(String[] args) {
        int[] arr= {12,24,36,48,60};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse(arr)));
        swapping(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

    }

    static void swapping(int[] array, int index1, int index2) {
        int temp= array[index1];
        array[index1]=array[index2];
        array[index2]=temp;

    }


    // Reversing the array.
    static int[] reverse(int[] array) {

//        for (int i = 0; i < (array.length)/2; i++) {
//            int k = array[i];
//            array[i]=array[(array.length-1)-i];
//            array[(array.length-1)-i]=k;
//
//        }

        // OR

        for (int i = 0; i < (array.length)/2; i++) {
            swapping(array, i ,(array.length-1)-i);

        }

        return array;
    }

}
