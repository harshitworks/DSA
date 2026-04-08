package com.harshit.Stack_and_Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(int capacity) {
        super(capacity);
    }
    public DynamicQueue() {
        super();
    }

    @Override
    public boolean insert(int value) {
        if(isFull()) {
            // double the size of queue
            int[] temp = new int[data.length*2];

            // copy the elements
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front+i)%data.length];

            }
            front = 0 ;
            end = data.length;
            data = temp;

        }
        // at this point we know our array has space so call the parent method
        super.insert(value);
        return true;
    }
}
