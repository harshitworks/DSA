package com.harshit.Stack_and_Queue;

public class Main {

    static void main(String[] args) throws Exception {
    CustomStack stack = new CustomStack(5);

        System.out.println(stack.push(10));
        System.out.println(stack.push(20));
        System.out.println(stack.push(30));
        System.out.println(stack.push(40));
        System.out.println(stack.push(50));
//        System.out.println(stack.push(10));            // stack overflow

        // using the dynamicstack
        CustomStack stack2 = new DynamicStack(5);

        System.out.println(stack2.push(10));
        System.out.println(stack2.push(20));
        System.out.println(stack2.push(30));
        System.out.println(stack2.push(40));
        System.out.println(stack2.push(50));
        System.out.println(stack2.push(100));    // as the size is 5 but we are able to push elements more than 5

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());  // throws an CustomStackException user defined
        System.out.println(stack.peek());      // this will throws an  exception using the Inbuilt class ..



    }

}
