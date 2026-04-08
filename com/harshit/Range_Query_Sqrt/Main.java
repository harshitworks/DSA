package com.harshit.Range_Query_Sqrt;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
        int n = arr.length;
        int sqrt = (int)Math.sqrt(n);
        // creation of blocks or preprocessing array
        int[] blocks  = new int[sqrt+1];
        int block_id = -1 ;
        for(int i = 0 ; i <  n ; i++) {
            if(i%sqrt==0) //that means we found a multilple of sqrt , new block bitchh
            {
                block_id++;
            }
            blocks[block_id]+=arr[i];
        }
        System.out.println(Arrays.toString(blocks));
        System.out.println(query(arr, blocks,3,7));
        update(arr,blocks,5,40);
        System.out.println(Arrays.toString(blocks));


    }

        public static int query(int[] arr, int[] blocks, int l, int r ) {
            int n = arr.length;
            int sqrt = (int)Math.sqrt(n);
            int ans  = 0 ;
            /// left part
            while(l%sqrt!=0 && l <=r ) {
                ans+=arr[l];
                l++;
            }
            /// middle part
            while(l + sqrt<=r) {
                ans+=blocks[l/sqrt];
                l+=sqrt;
            }
            /// right part
            while(l<=r) {
                ans+=arr[l];
                l++;
            }
            return ans;
        }
        public static void update(int[] arr , int[] blocks, int i , int val) {
            int n = arr.length;
            int sqrt = (int)Math.sqrt(n);
            int blockid = i/sqrt;
            blocks[blockid]+=val-arr[i];
            arr[i]=val;
        }
}
