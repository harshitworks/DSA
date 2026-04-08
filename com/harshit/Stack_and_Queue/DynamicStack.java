package com.harshit.Stack_and_Queue;

public class DynamicStack  extends CustomStack{
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    // all the operations gonna be same except the push as the size is exhausted
    // therefore we need to override the method
    @Override
    public boolean push(int value) {
        if(isEmpty()) {
            // creates an array of double the size of previous one
            int[] temp = new int[2*data.length];

            // copy the previous elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data =  temp; // here we are re intialising the data array that means we had created an array of double the size copy all the elements and now that array must be point by our original array variable temp is just an temporary varible all the opeartion will be done by 'data'
        }
        // as array was full and we solve that problem but doubling the size of original array so..now pushing can be done previously or normally

        return super.push(value);
    }
}
