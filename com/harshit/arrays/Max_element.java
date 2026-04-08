package com.harshit.arrays;

public class Max_element {

    static void main(String[] args) {
        int[] arr= {12,24,36,48,60};
        System.out.print("The maximum element in the array is: ");
        max(arr);


    }

    static void max(int[] array) {
        int k=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>k) {
                k=array[i];
            }

        }
        System.out.println(k);
    }

}
