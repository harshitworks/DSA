package com.harshit.binary_search.binary;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


public class  finding_in_infinte_array {
    static void main() {

        // the concept is we donot know the size of array or we can not use the arr.length function to find the length , as it sorted we will apply binary the thing to do is ... finding the start and end
        int[] array = { 10,20,30,40,50,60,70,80,90,100,120,140,150,180,500,560,600,700,800,952,963,974,1400};
        int target = 170;
        int ans = finding_index(array, target);
        System.out.println(ans);
    }
    static int finding_index(int[] arr, int target) {
        int start = 0;
        int end =  1 ;
        while(target>arr[end]){
            int temp = end ;
            end = end + (end-start)*2 ;
            start = temp + 1;
        }
        return searching(arr, target, start, end);

    }

    public static int searching(int[] arr, int target, int start, int end) {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target>arr[mid])
            {
                start = mid + 1 ;
            }
            else if ( target < arr[mid])
            {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1 ;
    }

}








