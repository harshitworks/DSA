package com.harshit.RadixSort;

public class Main {
    static void main(String[] args) {
        int[] nums = {29,23,8,432,45,89};

    }
    public static void countsort(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for(int exp = 1 ; max/exp>0; exp*=10) {
            countsort(nums,exp);
        }

    }
    public static void countsort(int[] nums, int exp) {
        int n = nums.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 1; i < n; i++) {}
    }
}
