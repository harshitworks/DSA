package com.harshit.OOPs.OOP6.Generic;

import java.util.Arrays;

public class CustomArrayList {
    int[] data;
    int Default_Size = 10 ;
    int size = 0 ;

    public CustomArrayList() {
        data = new int[Default_Size];
    }
    public CustomArrayList(int size) {
        data = new int[size];
    }

    public void add(int value) {
        if(isFull()) {
            resize();
        }
        data[size++]= value;
    }
    public boolean isFull() {
        return size==data.length;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public void resize() {
        int[] newdata = new int[data.length*2];
        System.arraycopy(data,0,newdata,0,size);
        data = newdata;
    }
    public int remove() {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[--size];
    }
    public int size() {
        return size;
    }
    public void clear() {
        size = 0 ;
        Arrays.fill(data,0);

    }
    public void display() {
        for( int i = 0; i < size; i++ ) {
            System.out.print(data[i] + " ");
        }
    }
    public int get(int index) {
        return data[index];
    }
    public void set(int index, int value) {
        data[index] = value;
    }
}
