package com.harshit.arrays;
import java.util.*;
import java.io.*;

public class NextSmaller {
    static void main(String[] args) {
        int[] arr = {2 ,1, 5,6,2,3};
        arr = new int[]{4,3,5,5,9,2,8,4,7,2,3,8,3,5,4,7,9};
        System.out.println(Arrays.toString(nextsmaller(arr)));
        System.out.println(Arrays.toString(presmaller(arr)));
        System.out.println(largest(arr,nextsmaller(arr),presmaller(arr)));

    }
    public static int[] nextsmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];
        Arrays.fill(next, arr.length);
        for (int i = 0; i < arr.length; i++) {

            while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
                int index = st.pop();
                next[index]=i;

            }
            st.push(i);
        }
        return next;
    }
    public static int[] presmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];
        Arrays.fill(next, -1);
        for (int i = arr.length-1; i >=0; i--) {

            while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
                int index = st.pop();
                next[index]=i;

            }
            st.push(i);
        }
        return next;
    }
    public static int largest(int[] arr, int[] next, int[] pre) {
        int n = arr.length;
        int area ;
        int max = 0 ;
        for(int i = 0 ; i < n ; i++) {
            area = 0;
            int height = arr[i];
            int width = next[i]-pre[i]-1;
            area = height*width;
            max = Math.max(area, max);
        }
        return max ;

    }

}
