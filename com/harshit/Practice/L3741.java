package com.harshit.Practice;


import java.util.*;

class L3741 {
    static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,2,5,6,2};
        System.out.println(minimumDistance(nums1));

    }
    public static int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {class Solution {
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
            map.put(num, map.getOrDefault(num,0)+1);
        }

        
        Set<Integer> set = new HashSet<>();
        for(int key : map.keySet()) {
            if(map.get(key) >2) set.add(key); 
            
        }

        Map<Integer, List<Integer>> map2 = new HashMap<>();
        for(int i = 0 ; i < n ; i++) {
            if(!set.contains(nums[i])) continue;
  
            map2.computeIfAbsent(nums[i], k-> new ArrayList<>()).add(i);
        }
        
        int ans = Integer.MAX_VALUE;
        for(Map.Entry<Integer, List<Integer>> entry : map2.entrySet()) {
            List<Integer> list = entry.getValue();
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i+2 < list.size(); i++) {
                int value = list.get(i+2)-list.get(i);
                min = Math.min(min, value);
            }
            ans = Math.min(ans,min);
        }
        return (ans==Integer.MAX_VALUE)?-1:ans*2;
        
    }
}