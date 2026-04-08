package com.harshit.binary_search.binary;

import java.util.Arrays;

public class mountain_peak_values_852
{
    static void main() {
        int[] nums = {3,5,7,9,3,2,0};
        int ans = index(nums);
        System.out.println(ans);
        System.out.println(nums[ans]);
    }

            static int index(int[] nums)
            {
                int start = 0 ;
                int end = nums.length-1;
                int mid = start + (end - start)/2;

                while(start<end)
                {
                    if(mid==0)
                    {
                        return mid+1;
                    }
                    // finding the peak value in a mountain array , this algorithm is inspired from Dikshit algo .
                    // somewhat broken'
                    if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
                    else if (nums[mid] > nums[mid - 1]) start = mid + 1;
                    else end = mid - 1;

                    mid = start + (end - start) / 2;

                }
                return -1;
            }



}
