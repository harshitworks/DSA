package com.harshit.binary_in_2D;

import java.util.Arrays;

public class search_in_matrix {
    static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int a[]= search_in_matrix(arr,44 );
        System.out.println(Arrays.toString(a));

           }

    static int[] search_in_matrix(int[][] arr, int target) {
        int row = 0 ;
        int col = arr[0].length-1;
        int temp;
        int[] ans = {-1,-1 };
        while(row < arr.length && col >= 0)
        {
          temp= arr[row][col];

          if(temp==target) { ans[0]=row; ans[1]=col; return ans ;}
          if(temp> target) col--;
          else row ++;
      }

      return ans ;
    }




}
