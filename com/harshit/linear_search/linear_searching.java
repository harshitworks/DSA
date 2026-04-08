package com.harshit.linear_search;

public class linear_searching {
    static void main(String[] args) {
int[] array = { 1,34,67,10,20,23};
int ans=linearsearch(array, 67);
        System.out.println(ans);
        System.out.println(linearsearch2(array, 10));



    }

    static int linearsearch(int[] arr, int target){
        if(arr.length==0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                return i;
            }

        }
        return -1;

    }
    static boolean linearsearch2(int[] arr, int target) {
        if(arr.length==0)
        {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                return true;
            }

        }
        return false;

    }



}
