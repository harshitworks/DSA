package com.harshit.binary_search.binary;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class search_descending {
    static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the element to be searched");
            int item = input.nextInt();
            int[] arr = {72,60,48,36,24,12,0};


            int ans = binarysearch2(arr, item);
            System.out.println(item+" is found at "+ans+" position ");
            System.out.println(ans);


        }
        static int binarysearch2(int[] arr , int item) {
            int start = 0;
            int end = arr.length - 1;

            while(start<=end) {
                int mid = start + (end-start)/2;

                if(item>arr[mid])
                {
                    end=mid-1;
                }
                else if (item<arr[mid]) {
                    start=mid+1;
                }
                else {

                    return (mid+1);

                }

            }
            return -1;
        }



}





