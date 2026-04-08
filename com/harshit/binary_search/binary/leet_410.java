package com.harshit.binary_search.binary;

public class leet_410 {
    static void main() {
        int[] arr= {1, 4, 4, 2, 3, 5 };
        int k = 3;

        int ans = minimise_max(arr ,k);
        System.out.println(ans);
    }


    static int minimise_max(int []arr ,int k) {
        int start = 0 ;
        int end = 0 ;
        for(int i = 0 ; i < arr.length ; i ++)
         {
             start = Math.max(start , arr[i]);
             end = end + arr[i];
         }
        while ( start< end )
        {
            int mid = start + (end-start)/2 ;
            int sum = 0 ;
            int pieces = 1 ;
            for(int num : arr)
            {
                 if(sum+num> mid) {
                     sum = num ;
                 pieces++; }
                 else sum = sum + num ;
            }
             if (pieces> k ) start = mid + 1 ;
             else end = mid ;   // here if the number of pieces are lesser than the allowed pieces then minimise the maximum by letting down the end as well as mid .
        }
        return end  ;

    }
}
