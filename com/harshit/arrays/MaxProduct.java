package com.harshit.arrays;

public class MaxProduct {
    static void main(String[] args) {
        int[] arr = { -2,0,-1};
        int ans = max_product(arr);
        int ans2 = max_product2(arr);
        System.out.println(ans);
        System.out.println(ans2);
}
// Using Kadane's Extended Algo:
public static int max_product(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int ans = arr[0] ;

        for(int i = 1 ; i < arr.length; i++) {
            int temp = max ;

            max = Math.max(arr[i], Math.max(arr[i]*max, arr[i]*min));
            min = Math.min(arr[i], Math.min(arr[i]*temp, arr[i]*min));
            ans = Math.max(ans , max);
        }


        return ans ;
}
// Using Intuitive :
    public static int max_product2(int[] arr) {
        int prefix = 1;
        int suffix = 1 ;
        int max = Integer.MIN_VALUE;
        int n = arr.length ;

        for(int i = 0 ; i < n; i++) {
            if(prefix==0) prefix = 1 ;
            if(suffix==0) suffix = 1 ;
            prefix*=arr[i];
            suffix*=arr[n-1-i];
            max = Math.max(max , Math.max(prefix, suffix));

        }
        return max ;
    }


}
