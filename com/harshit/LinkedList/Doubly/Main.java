package com.harshit.LinkedList.Doubly;

public class Main {
    static void main(String[] args) {
        DLL list = new DLL();
        list.InsertFirst(10);
        list.InsertFirst(20);
        list.InsertFirst(30);
        list.InsertFirst(40);
        list.display();
        list.InsertLast(100);
        list.InsertLast(200);
        list.insertafter(300,200);
        list.insertbefore(122,40);
        list.insertbefore(123,40);
        list.display();
        list.insertafter(4000,300);
        list.display();
    }
}
