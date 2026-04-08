package com.harshit.subset_susequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {1,2,2};
        System.out.println(subset_with_iteration(arr));
        System.out.println(subset_with_duplicates(arr2));

    }
    static List<List<Integer>> subset_with_iteration(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();    // creating a main list that contains lists
        outer.add(new ArrayList<>());  // appending a single empty list in the main list
        for(int num: arr) {
            int n = outer.size();
            for(int i = 0 ; i < n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;

    }
    static List<List<Integer>> subset_with_duplicates(int[] arr) {
        Arrays.sort(arr); // duplicates must be adjacent to each other
        List<List<Integer>> outer = new ArrayList<>();    // creating a main list that contains lists
        outer.add(new ArrayList<>());  // appending a single empty list in the main list
            int start  ;
            int end = 0 ;
        for(int i = 0 ; i < arr.length; i++ ) {
            // if duplicates were found then our start = end + 1
            if(i>0 && arr[i]==arr[i-1]) {
                start = end + 1 ;
            }
            else start = 0 ;
            end = outer.size()-1 ;   // store the size of previously created list , and end will point to the last index of the list , so that we can use it for initializing start in next turn if required
            int n = outer.size();
            for(int j = start ; j < n ; j++) {   // appending from the desired position
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);

            }
        }
        return outer;

    }
}
