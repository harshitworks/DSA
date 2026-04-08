package com.harshit.Stack_and_Queue;

public class CustomStack {
    protected int[] data;
    private static final int Default_size = 10;
    int ptr = - 1;
    public CustomStack() {
//        data = new int[Default_size];   // have same meaning
        this(Default_size);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }   // this is the consructor


    public boolean isEmpty() {
        return ptr==-1;
    }


    public boolean isFull() {
        return ptr == data.length;
    }


    public boolean push(int value) {
        ptr++;
        if(isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        data[ptr] = value;
        System.out.println("Pushed value: " + value);
        return true;
    }


    public int pop()  throws CustomStackException {
        if(isEmpty()) {
            throw new CustomStackException("Stack is Empty and this is User defined exception which extends exception class");
//            System.out.println("Stack is empty");
//            return -1;
        }
        return data[ptr--];
    }


    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot peek an empty stack and this is a user defined exception");
//            System.out.println("Stack is empty");
        }
        return data[ptr];
    }
}
