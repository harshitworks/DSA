package com.harshit.CountSort;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {
        int[]  nums = {3,4,1,3,2,5,2,8};
        System.out.println(Arrays.toString(nums));
        countsort2(nums);
        countsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void countsort(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 0 ; i <n ;i++) {
            if(nums[i]>max) {
                max = nums[i];
            }
        }
        int[] freq = new int[max+1];
        // creates the frequency array :
        for(int i = 0 ; i < n  ; i++) {
            freq[nums[i]]++;
        }
        // now modify the original array
        int k = 0 ;
        for(int i = 0 ; i< freq.length; i++) {
            while(freq[i]-->0) {
            nums[k++]=i;
            }
        }
    }

    public static void countsort2(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 0 ; i <n ;i++) {
            if(nums[i]>max) {
                max = nums[i];
            }
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < n ;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // now traverse the map from o to max :
        int k = 0 ;
        for(int i = 0 ; i< max ; i++) {
            int val = map.getOrDefault(i,0);
            while(val-->0) {
                nums[k++]=i;
            }
        }
    }
}
