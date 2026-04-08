package com.harshit.merge_sort;

import java.util.Arrays;

public class merge_using_recursion {
    static void main() {
        int[] arr = {12, 56, 2, 69,2, 11, 23};
        System.out.println(Arrays.toString(merge_sort(arr)));
        // actual array we remains array.
        System.out.println(Arrays.toString(arr));

    }

    // creating new array everytime a recursive function calls , that is Outplace sorting
    static int[] merge_sort(int[] arr) {
        if (arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));
        // so what we need to do now , we have to merge the both arrays we got from the future calls,

        return merge(left, right);

    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {

            if (first[i] >= second[j]) {
                mix[k] = second[j];
                j++;
            } else {
                mix[k] = first[i];
                i++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }





}
