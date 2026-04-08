package com.harshit.Stack_and_Queue;

public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10 ; // static because size gonna be same for all the objects of the class

    int end = 0 ;
     public Queue() {
         data = new int[DEFAULT_SIZE];   // if no size is given , then it will creates an array of default size ;
     }
     public Queue(int size) {
         data = new int[size];   // if size if given then it will creates an array of given size
     }

     public boolean isEmpty() {
         return end == 0;
     }

     public boolean isFull() {
         return end == data.length;
     }

     public boolean insert(int value) {
         if(isFull()) {
             System.out.println("Queue is full");
             return false;
         }
         data[end] = value;
         end++;
         return true;
     }

     public int remove() {
         if(isEmpty()) {
             System.out.println("Queue is empty");
             return -1;
         }
        // we have to shift the elements to remove the first element

         int removed = data[0];
         for (int i = 1; i < end; i++) {
             data[i-1] = data[i];

         }
         data[end-1] = 0;   // last element = 0 , optional as at the end we are going to decrease the size of the array
         end--;   // size decreased by one unit
         return removed;

     }

     public int front() {
         if(isEmpty()) {
             System.out.println("Queue is empty");
         }
         return data[0];
     }

     public void display() {
         if(isEmpty()) {
             System.out.println("Queue is empty");
         }
         for (int i = 0; i < end; i++) {
             System.out.print(data[i] + "->");

         }
         System.out.print("END");
         System.out.println();
     }


}

