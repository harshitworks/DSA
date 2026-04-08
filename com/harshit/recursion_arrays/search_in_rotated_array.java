package com.harshit.recursion_arrays;

public class search_in_rotated_array {
    static void main() {
        int[] arr = {11,15,19,25,27,29,31,35,39,42,58,89};
        System.out.println(search(arr,45,0, arr.length-1));


    }


    // write all the cases on the notebook and then apply the condition for start and end.
    static int search(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && arr[mid] >= target) return search(arr, target, start, mid - 1);
            else return search(arr, target, mid + 1, end);
        }
        if (target >= arr[mid] && target <= arr[end]) return search(arr, target, mid + 1, end);

        return search(arr, target, start, mid - 1);

    }
}
