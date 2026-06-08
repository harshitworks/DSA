package com.harshit.DP;

import java.util.Arrays;

public class Maximum_sum_Non_Adjacent {
    static void main(String[] args) {
        int[] nums = {0,5,6,7,1,9,3,44};
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp, -1);
        }
        int ans = maximumSum(n-1,nums,dp);
        System.out.println(ans);
        int ans2 = tabulated(nums);
        System.out.println(ans2);

    }

    // Memoization + Recursion
    public static int maximumSum(int i, int[] nums, int[] dp) {
        if(i==0) return nums[0] ;
        if(i < 0) return 0 ;
        int pick = nums[i] + maximumSum(i-2, nums, dp );
        int not = 0 +  maximumSum(i-1, nums, dp);
        return Math.max(pick, not);

    }
    // Tabulation
    public static int tabulated(int[] nums) {
        int n = nums.length;
        int[] dp  = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            int pick = nums[i];
            if(i>1) pick += dp[i-2];
            int not = 0 +  dp[i-1];
           dp[i] = Math.max(pick, not);

        }
        return dp[n-1];
    }
}
