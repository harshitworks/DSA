package com.harshit.Heaps;

public class Main {
    static void main(String[] args) throws Exception {
    Heap<Integer> heap = new Heap<>();
    heap.insert(20);
    heap.insert(3);
    heap.insert(40);
    heap.insert(12);
//        System.out.println(heap.remove());
        System.out.println(heap.heapSort());
    }
}
