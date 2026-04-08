package com.harshit.LinkedList.Questions;

public class LL {

    private Node head;
    private Node tail;
    private int size ;

    public LL() {
        this.size = 0 ;
    }





    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }



    // questions
    public void remove_dup() {
        Node node = head;
        while(node.next!=null) {
            if(node.value==node.next.value) {
                node.next=node.next.next;
            }
            else {
                node=node.next;
            }
        }
        tail = node;
        tail.next=null;
    }


    public void sort_list( int start, int count) {
        if(count==0) {
            return ;
        }
        if(count>start) {
            Node f = get(start);
            Node s = get(start + 1);
            if (f.value > s.value) {
                // three cases of swapping

                // case 1: when f is head
                if(f==head) {
                    head = s;
                    f.next = s.next;
                    s.next = f;
                }

                // case 2: when s is tail
                else if(s==tail) {
                    Node pre=get(start-1);
                    pre.next = s;
                    tail = f;
                    f.next = null;
                    s.next=tail;
                }
                else {

                    // case 3 : in between

                    Node pre=get(start-1);
                    pre.next = s;
                    f.next = s.next;
                    s.next = f;
                }

            }

            sort_list(start+1 , count);
        }
        else {
            sort_list(0, count - 1);
        }
    }


    public Node get(int index) {
      Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;
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
