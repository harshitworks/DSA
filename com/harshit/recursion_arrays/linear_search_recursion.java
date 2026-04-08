package com.harshit.recursion_arrays;

import java.util.ArrayList;

public class linear_search_recursion {
    static void main() {
        int[] arr= {12,24,36,48,60,60,72};
        int target= 60 ;
        boolean ans = search1(arr, 0, arr.length-1,target );
        int ans2 = search2(arr, 0, arr.length-1,target );
        int ans3 = search3(arr, 0, arr.length-1,target );
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);

      ArrayList<Integer> list = new ArrayList<>(2);   // made a Array list to store the indices of the target
      search4(arr, 0, arr.length-1,target,list );      // passes the list as an argument
        System.out.println(list);                                // printing the list , as we store all the indices in the list and make our function void type

        ArrayList<Integer> list2 = new ArrayList<>(4);
        ArrayList<Integer> ans4 = search5(arr,target,0,list2);
        System.out.println(ans4);                  // here printing the ans4 will itself print the updated list , as we passed as an argument and the return type is also list.


        System.out.println(search6(arr, target, 0));
    }

    static boolean search1(int[] arr, int start , int end , int target ) {
        if(start>end) return false;
        if(arr[start]==target) return true;
        else return search1(arr,start+1,end, target);
    }
// search from the starting index and return it :
    static int search2(int[] arr, int start , int end , int target ) {
        if(start>end) return -1 ;
        if(arr[start]==target) return start;
        else return search2(arr,start+1,end, target);
    }

    // search from the last index
    static int search3(int[] arr, int start , int end , int target ) {
        if(start>end) return -1 ;
        if(arr[end]==target) return end;
        else return search3(arr,start,end-1, target);
    }

    // search all the occurrence of the target:
    static void search4(int[] arr, int start , int end , int target,ArrayList<Integer> list ) {
        // our function is void here as , we are storing our values in a list and then separately printing all the values , we can also make it ArrayList return type and then print the list inside the function..
        if(start>end) return ;
        if(arr[start]==target) list.add(start);
        search4(arr,start+1,end, target, list);
    }

    static ArrayList<Integer> search5(int[] arr, int target, int start, ArrayList<Integer> list2) {
      if(start==arr.length-1) return list2;
      if(arr[start]==target)  list2.add(start);
    return search5(arr,target,start+1,list2);
    }

  // very Important

    // Goal is to return a ArrayList but donot take it in argument.
    static ArrayList<Integer> search6(int[] arr, int target, int start) {
        ArrayList<Integer> list = new ArrayList<>();
        if(start==arr.length-1) return list;
        if(arr[start]==target) list.add(start);
        ArrayList<Integer> pre_ans = search6(arr, target,start+1);    // storing the answer from the previous function call , obviously in a list , as the return type of the function is list
        list.addAll(pre_ans);   // here we are adding all the previous answer to the current list ongoing in the function call
        return list;          // after appending all the answers from previous to current , we are returning it

    }
}
