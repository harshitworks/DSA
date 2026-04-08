package com.harshit.arrays;

import java.util.Arrays;

public class Not_fix_col {

    static void main(String[] args) {

        //       We can have an array which has variable number of columns in each row.
        int[][] arr4 =
                {
                        {1, 2, 3},
                        {4, 5},
                        {7, 8, 9,10}
                };


        // Output 2
        for(int rows =0; rows < arr4.length; rows++) {
            System.out.println(Arrays.toString(arr4[rows]));   // printing each row one at a time..(like 1D array)
        }

        // Enhanced loop: of output 2
        for(int[] a : arr4)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
