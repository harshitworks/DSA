package com.harshit.OOPs.OOP6.Comparing;

import java.util.Arrays;

public class Main {

    static void main(String[] args) {
    Student[] arr = new Student[8];
    int k = 0 ;
    arr[k++]= new Student(23, 47.4f, "Harshit");
    arr[k++]= new Student(24, 57.4f, "xyz");
    arr[k++]= new Student(25, 53.4f, "abs");
    arr[k++]= new Student(26, 53.2f, "ghj");
    arr[k++]= new Student(27, 33.2f, "kjh");
    arr[k++]= new Student(28, 55.2f, "tr");
    arr[k++]= new Student(21, 93.2f, "rr");
    arr[k++]= new Student(29, 53.9f, "eee");

    Arrays.sort(arr);
    // we can directly defined the sorting criteria here too using lambda expressions
        Student[] arr2 = arr.clone();
        Arrays.sort(arr2, (a,b)-> a.name.compareTo(b.name));
        System.out.println(Arrays.toString(arr2));

    System.out.println(Arrays.toString(arr));
    if(arr[2].compareTo(arr[5]) < 0) {
        System.out.println(" Student 2 is more intelligent");
    }


    }



}

