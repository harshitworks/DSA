package com.harshit.Heaps;
import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {

    private ArrayList<T> list;
    public int size;
    /// Constructor
    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int i) {
        return (i-1)/2;

    }

    private int left(int i) {
        return 2*i + 1;

    }

    private int right(int i) {
        return 2*i + 2;

    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size()-1);
    }
    private void upHeap(int index) {
        if(index==0) {
            return;
        }
        int parent = parent(index);
        if(list.get(index).compareTo(list.get(parent))<0) {
            swap(index, parent);
        }
        upHeap(parent);
    }

    public T remove() throws Exception {
        if(list.isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }
        T removed = list.get(0);
        T last = list.removeLast();
        if(!list.isEmpty()) {
        list.set(0,last);
        }
        downHeap(0);
        return removed;
    }
    private void downHeap(int index) {
        if(index>=list.size()) {
            return;
        }
        int left = left(index);
        int right = right(index);
        int min = index;
        if(left< list.size() && list.get(min).compareTo(list.get(left))>0) {
            min = left;
        }
        if(right< list.size() && list.get(min).compareTo(list.get(right))>0) {
            min = right;
        }
        // that means we got the violaters
        if(index!=min) {
            swap(index, min);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }


    public int size() {
        return list.size();
    }
}
