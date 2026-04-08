package com.harshit.LinkedList.Doubly;

public class DLL {
    private Node head;

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.pre=null;
        if(head!=null) {
            head.pre=node;
        }
        head=node;
    }
    public void InsertLast(int val) {
        Node node =  new Node(val);
        Node temp = head;
        node.next=null;
        if(head==null) {
            head=node;
            node.pre=null;
            return;
        }
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=node;
        node.pre=temp;

    }

    public void insertafter(int val, int target) {
        Node node = new Node(val);
        Node temp = head;
        while(temp!=null) {
            if(temp.value==target) {
               break;
            }
            temp=temp.next;
        }
        if(temp==null) {
            System.out.println("Node does not Exist");
            return;
        }
        node.pre=temp;
        node.next=temp.next;
        if(temp.next!=null) {
            temp.next.pre = node;  // this  can give null pointer exception when we try to add a node after the last node then temp.next points to null which is acceptable but null.pre is not defined
        }
        temp.next=node;
    }

    public void insertbefore(int val, int target) {
        Node node = new Node(val);
        if(head.value==target) {
            node.pre=null;
            node.next=head;
            head.pre=node;
            head=node;
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            if(temp.next.value==target) {
                break;
            }
            temp=temp.next;
        }

        node.pre=temp;
        node.next=temp.next;
        temp.next.pre=node;
        temp.next=node;


    }

    public void display() {
        Node tra = head;
        while(tra!=null) {
            System.out.print(tra.value+"->");
            tra=tra.next;
        }
        System.out.println("END");
    }





    private class Node {
        private int value ;
        private Node pre ;
        private Node next ;

       public Node (int value) {
            this.value = value;
        }
        public Node (int value, Node pre, Node next) {
           this.value = value;
           this.pre=pre;
           this.next=next;
        }
    }
}
