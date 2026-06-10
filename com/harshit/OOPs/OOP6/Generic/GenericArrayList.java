package com.harshit.OOPs.OOP6.Generic;

import java.util.Arrays;

// here T should be of Number type or its sub classes;
//public class GenericArrayList<T extends Number> {
public class GenericArrayList<T> {
    Object[] data;
    int Default_Size = 10 ;
    int size = 0 ;

    public GenericArrayList() {

        data = new Object[Default_Size];
    }
    public GenericArrayList(int size) {
        data = new Object[size];
    }

    public void add(T value) {
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
        Object[] newdata = new Object[data.length * 2];
        System.arraycopy(data,0,newdata,0,size);
        data = newdata;
    }
    public T remove() {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T)(data[--size]);
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
    public T get(int index) {
        return (T)(data[index]);
    }
    public void set(int index, T value) {
        data[index] = value;
    }
}
