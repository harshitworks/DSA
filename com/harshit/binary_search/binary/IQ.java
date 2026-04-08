package com.harshit.binary_search.binary;

public class IQ {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 23;
        System.out.println(question1(arr, target));

        System.out.println(question1(arr,target));


    }
    static int question1(int[] arr, int target) {
        int start= 0;
        int end = arr.length-1;
        while(start<= end) {
        int mid= start + (end-start)/2;
            if(target>arr[mid])
            {
                start=start+1;
            }
           else if(target<arr[mid])
            {
                end=end-1;
            }
            else if(target==arr[mid]) {
                return arr[mid + 1];
            }
            else {
                return arr[mid+2];
            }

        }
        return 0;



    }
}
