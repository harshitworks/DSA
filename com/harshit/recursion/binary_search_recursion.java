package com.harshit.recursion;

public class binary_search_recursion {
    static void main() {
        int[] arr = {12, 24, 36, 48, 60, 72};
        int target = 600;
        int ans = search(arr, 0, arr.length - 1, target);
        System.out.println(ans);
    }

    //  binary search using the recursion
    static int search(int[] arr, int start, int end, int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return search(arr, start, mid - 1, target);
        if (arr[mid] < target) return search(arr, mid + 1, end, target);
        return -1;

    }
}