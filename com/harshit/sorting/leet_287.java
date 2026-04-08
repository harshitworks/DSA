package com.harshit.sorting;


import static com.harshit.sorting.cyclic_sort.swap;

public class leet_287 {
  /*  Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

    There is only one repeated number in nums, return this repeated number.

    You must solve the problem without modifying the array nums and using only constant extra space.

*/
    // the first method to solve this problem , is sort the array using the cyclic sort ,all the elements got their right position except the repeated one , which will placed at the end of the array
    // get the repeated element from the last position of the array



    // the second method to solve this ,.. applying the cyclic check whether element is at the correct index or not then check whether it is at ..either it is equals to the element at his correct position if not then swap

    static void main() {
        int[] arr = {1,2,4,3,5,4};
        System.out.println(duplicate_number(arr));

    }
    static int duplicate_number(int[] arr) {
        int i = 0 ;
        while (i<arr.length) {
            int correct = arr[i]-1 ;
            if(arr[i]!=i+1)
            {
                if (arr[i] == arr[correct]) {  // here we are checking the element value and the value at its correct       position if the values are distinct then just do swapping , but if the values are same then we got the duplicate item,
                    return arr[i];
                } else {
                    swap(arr, i , correct);
                }

            }
            else i++ ;
        }

        return - 1 ;
    }


}
