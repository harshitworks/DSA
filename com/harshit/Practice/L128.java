package com.harshit.Practice;

import java.util.*;
class L128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        if(n==0) return 0 ;
        for(int num : nums) {
            set.add(num);
        }
        int ans = 0 ;
        
        for(int num: set) { 
            int len = 0 ;
            if(!set.contains(num-1)) {  // only checks when there is a fresh start that means we had not count it earlier , like 1,2,3,4 : we will not check for 2,3,4 as we had already count them at the time of 1 :
            
                while(set.contains(num)) {
                    len++;
                    num++;
                }
            }
            ans = Math.max(ans, len);

        }
        return ans;
        
    }
}