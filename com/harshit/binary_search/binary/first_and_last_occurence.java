package com.harshit.binary_search.binary;

import java.util.Arrays;

public class first_and_last_occurence {
    static void searchRange(String[] args) {
        int[] nums = {2,4,5,7,7,7,9};
        int target =  7;
        int[] ans = { -1 , -1 };
        ans[0] =search(nums, target, true );
        ans[1] = search(nums, target, false );
        System.out.println(Arrays.toString(ans));
    }

    static int search(int[] nums , int target, boolean index)
    {
int ans = -1 ;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if (target<nums[mid]) {
                end=mid-1;
            }
            else {
                if(index)
                {
                    end = mid - 1;
                    ans = mid;
                }
                else {
                    start = mid + 1;
                    ans = mid;
                }
            }
    }
            return ans ;

    }




}
