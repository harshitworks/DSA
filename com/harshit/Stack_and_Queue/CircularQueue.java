package com.harshit.Stack_and_Queue;

public class CircularQueue {
    protected int[] data ;
    private static final int DEFAULT_CAPACITY = 10;
    protected int front=0;
    protected int end=0;
    public static int size=0;
    public CircularQueue() {
        data = new int[DEFAULT_CAPACITY];   // if no size is given , then it will creates an array of default size ;
    }
    public CircularQueue(int size) {
        data = new int[size];   // if size if given then it will creates an array of given size
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean insert(int value ) {
        if(isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        data[end]=value;
        end++;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        return data[front];
    }

    public void  display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
       int  i = front ;
      do {
          System.out.print(data[i]+" →");
          i ++;
          i = i % data.length;
      } while(i!=end);
        System.out.println();
    }
}
