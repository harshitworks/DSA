package com.harshit.LinkedList.Circular;

public class CLL {
    private Node head;
    private Node tail;


    public CLL() {
        this.head = null;
        this.tail = null;
    }


    public void insert(int val) {
        Node node = new Node(val);
        if(head==null) {     // that means the list is empty
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void delete(int val) {
        if(head==null) {
            System.out.println("List is Empty cannot deleted");
            return;
        }
        else if(head == tail && head.value==val) {
            head=null ;
            tail = null ;
            return;
        }
        else if(head.value==val) {
            head=head.next;
            tail.next=head;
            return;
        }
        Node curr = head;
        boolean found = false;
         do {
             Node nextNode = curr.next;
             if(nextNode.value==val) {
                 found = true;

                 if(nextNode==tail) {    // when deletion of tail occurs
                     tail=curr;
                 }
                 curr.next=nextNode.next;
                 return;
             }
             curr=curr.next;
         } while(curr!=head);
        if(!found) {
            System.out.println("Value not found");
        }


    }

    public void display() {
        Node temp = head;
        if(head==null) {
            System.out.println("List is Empty ");
            return;
        }
        do {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
    }

    private class Node {
    private int value ;
    private Node next ;


    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
}
