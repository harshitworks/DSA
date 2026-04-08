package com.harshit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multi_dimensional {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaration of the 2 D array
        // datatype[][] variable_name = new datatype[no. of rows--> must][no. of columns]





        /*

         so 2D arrays are the collection of several 1D arrays , when we try to find the number of elements in 1D array using .length we actually get the number of columns. We can consider 1D array as 2D array of size [1][n] that is ..having 1 row and n columns
         therefore when we use .length we get number of columns(number of elements)
         so when we try to find the number of columns in 2D array, we go to each row and calculate elements  by 'array_name[0,1,2].length' and we get the number of columns .

         */


        int[][] arr2 = new int[3][3];      // we  can skip the number of columns in declaration.
              // OR
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(arr2.length);          // (array_name.length): returns the number of rows in 2-Dimensional array.

        // Taking Input
        for(int rows =0; rows < arr2.length; rows++) {
            for(int col =0; col < arr2[rows].length; col++) {
                arr2[rows][col]= input.nextInt();

            }
        }

        // Output
        for(int rows =0; rows < arr2.length; rows++) {
            for(int col =0; col < arr2[rows].length; col++) {
                System.out.print(arr2[rows][col]+" ");

            }
            System.out.println();

        }

        // Output 2
        for(int rows =0; rows < arr2.length; rows++) {
            System.out.println(Arrays.toString(arr2[rows]));   // printing each row one at a time..(like 1D array)
        }

                 // Enhanced loop of Output 2.
                  for(int[] a : arr2)
                  {
                      System.out.println(Arrays.toString(a));
                  }







    }


















}
