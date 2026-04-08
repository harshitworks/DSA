package com.harshit.linear_search;

import java.util.Arrays;

public class search_in_2d_array {
    static void main(String[] args) {
        int[][] arr = {
                {10, 34, 33},
                {45, 67, 78, 43},
                {12, 24}

        };
        int target = 43;
        System.out.println(Arrays.toString(search(arr, target)));



    }

    static int[] search(int[][] array, int target) {
        for (int rows = 0; rows < array.length; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {
                if (array[rows][cols] == target) {
                    return new int[]{rows, cols};
                }

            }

        }

return new int[]{};

    }


}
