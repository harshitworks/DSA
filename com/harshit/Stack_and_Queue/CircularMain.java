package com.harshit.Stack_and_Queue;

public class CircularMain {
    static void main(String[] args) {
//        CircularQueue circular = new CircularQueue(10);
        DynamicQueue circular = new DynamicQueue(10);
        circular.insert(12);
        circular.insert(24);
        circular.insert(36);
        circular.insert(48);
        circular.insert(60);
        circular.display();

        circular.remove();
        circular.remove();
        circular.insert(72);
        circular.insert(78);
        circular.display();
        System.out.println(circular.insert(80));
        circular.insert(85);
        circular.display();
        System.out.println(circular.insert(125));
        System.out.println(circular.insert(68));
        System.out.println(circular.insert(89));
        circular.display();
        circular.insert(102);

        circular.insert(452);
        circular.display();
    }
    }
