package com.harshit.binary_in_2D;

import java.util.Arrays;

public class search_in_sorted_matrix {
    static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        int[] a = search_in_sorted_matrix(arr,2 );
        System.out.println(Arrays.toString(a));

    }


    static int[] search_in_row(int[][] arr, int row , int col1 , int col2 , int target) {
        while(col1<=col2) {
            int mid = col1 + (col2-col1)/2;
            if(arr[row][mid]==target) return new int[]{row , mid };
            if(target>arr[row][mid]) col1 = mid + 1 ;
            else col2 = mid -1 ;
        }
        return new int[] { -1 , -1 };
    }


    static int[] search_in_sorted_matrix(int[][] arr, int target) {

        if(arr.length==1) return search_in_row(arr, 0, 0, arr[0].length-1, target);

        // now we will apply binary search to reach two rows.
        int start = 0 ;
        int end = arr.length-1;
        int col = arr[0].length-1;
            int cmid = col/2 ;
           while(end-start > 1 ) {
            int rmid = start + (end - start )/2 ;
            int element = arr[rmid][cmid];
            if(element== target) return new int[]{rmid, cmid};
            if(element> target) end = rmid ;
            if(element < target) start = rmid ;

        }
        // now we will have two rows remaining

        // check whether the target is in two columns at the mid
        if(arr[start][cmid]==target) return new int[]{start , cmid};
        if(arr[start+1][cmid]==target) return new int[]{start+1 , cmid};

        // there will be 4 cases here :
        // search in the left half of first row
        if(target<= arr[start][cmid-1]) return search_in_row(arr, start, 0, cmid-1, target);
        // search in the right half of the first row
        if(target>= arr[start][cmid+1] && target<= arr[start][col]) return search_in_row(arr, start, cmid+1, col, target);
        // search in the left half of second row
        if(target<= arr[start+1][cmid-1] && target>= arr[start+1][0]) return search_in_row(arr, start+1, 0, cmid-1, target);
        // search in the right half of the second row
        if(target>= arr[start+1][cmid+1] && target<= arr[start+1][col]) return search_in_row(arr, start+1, cmid+1, col, target);


        int[] ans = {-1,-1 };

        return ans ;
    }

}
