package com.harshit.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Array list is similar to arrays the extra benefits of using the Array list is it has several other features and its size is variable
// Syntax: ArrayList<data_type> variable_name = new ArrayList<data_type>(size);

        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> list2 = new ArrayList<> (3);

        /* we can add more than 10 elements as we mentioned 10 */

        list.add(544);
        list.add(74);
        list.add(24);
        list.add(44);
        list.add(54);
        list.add(4);
        list.add(54);
        list.add(544);
        list.add(74);
        list.add(24);
        list.add(44);
        list.add(54);
        list.add(4);
        list.add(54);



        // we can get all the functions by 'variable.'

        // list.addFirst(45);
        System.out.println(list);

     // taking input from the iteration.
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list2.get(i)+" ");
        }





//      Creating Array-list inside a array list
        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>(3);

        // Initialisation
                for (int i = 0; i < 3; i++) {
                    list3.add(new ArrayList<>());

        }

                // Add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <4 ; j++) {
                list3.get(i).add(input.nextInt());    // here we are accessing the first array_list and then adding elements in it.

            }
        }

        // Printing
        for (int i = 0; i < 3; i++) {
                System.out.println(list3.get(i));

        }

        //OR
        System.out.println(list3);
    }
}
