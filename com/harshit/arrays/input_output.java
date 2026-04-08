package com.harshit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input_output {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
         // input using for loop
        for(int i=0; i< arr.length; i++) {
            arr[i]=input.nextInt();
        }

//         printing the elements
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

             //OR
        for (int j : arr) {
            System.out.print(j+" ");

        }
            // or we can use Arrays.tostring method to print the array by just its name.

            System.out.println(Arrays.toString(arr));


        // modifying the elements
        String[] name = new String[3];
        for(int i =0;i<name.length;i++)
        {
            name[i]=input.next();
        }
        name[0]="gaur";  // directly modifying the element.

        for(int i=0; i<name.length;i++) {
            System.out.print(name[i]+" ");
        }



        // 40
    }


}
