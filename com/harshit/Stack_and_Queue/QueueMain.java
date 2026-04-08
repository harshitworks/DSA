package com.harshit.Stack_and_Queue;

public class QueueMain {
    static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println(queue.insert(11));
        System.out.println(queue.insert(12));
        System.out.println(queue.insert(14));
        System.out.println(queue.insert(17));
        System.out.println(queue.insert(51));
        
//        System.out.println(queue.insert(171));


        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.display();








    }

}
