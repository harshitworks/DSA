package com.harshit.LinkedList.Circular;



public class Main {
    static void main(String[] args) {
        CLL list = new CLL();
        list.display();
        list.insert(45);
        list.insert(5);
        list.insert(4);
        list.insert(40);
        list.insert(41);
        list.insert(42);
//        list.display();
        list.delete(45);
        list.display();
        list.delete(42);
        list.delete(40);
        list.delete(41);
        list.display();
        list.delete(4);
        list.display();
        list.delete(75);
        list.display();
//        list.delete(45);

    }



}
