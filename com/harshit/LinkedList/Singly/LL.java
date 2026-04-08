package com.harshit.LinkedList.Singly;

public class LL {

        private Node head;
        private Node tail;
        private int size ;

        public LL () {
            this.size = 0 ;
        }

    public void InsertFirst(int val) {
        Node node = new  Node(val);
        node.next=head;
        head=node;

        if(tail==null) {
            tail= head;
        }
        size++;

    }

    public void InsertLast(int val) {
        if(tail==null) {
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void reverse_list(Node node) {
            if(node==tail) {
                head=tail;
                return ;
            }
            reverse_list(node.next);
            // as we are doing it after the function call so below lines will execute after the returning the function call
        // and everytime we are pushing the tail forward
            tail.next=node ;
            tail=node;
            tail.next=null;
    }

    public void reverse() {
            if(head==null || head.next==null ) return;
            Node pre = null ;
            Node present = head;
            Node Next = present.next;


            while(present!=null) {
                present.next=pre;
                // now update all the three pointers that is ..move forward
                pre=present;
                present= Next;
                if(Next!=null) {
                Next = Next.next;
                }

            }
            // as the loops break when presents points to null and pre points to last node ...that is our new head
            head = pre ;
    }


    // reversing the list -II

    public void reverse2(int left, int right) {
        if (left == right) return;

        Node prev = null;
        Node current = head;

        // Step 1: Move to position left
        for (int i = 1; i < left; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;        // node before reversed part
        Node newEnd = current;   // will become end after reverse

        Node next = null;

        // Step 2: Reverse between left and right
        for (int i = 0; i < right - left + 1; i++) {
            next = current.next;
            current.next = prev;   // connecting the previous node
            prev = current;
            current = next;
        }

        // Step 3: Reconnect
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
    }


    // creating a list from another list that is copying the list

//    public static Node copy(LL list1) {
//        Node tra = list1.head;
//        Node pre = new Node(-1);
//        Node head2=pre;
//        while(tra!=null) {
//            Node tra2 = new Node(tra.value);
//            pre.next = tra2;
//            pre = tra2;
//
//            tra=tra.next;  // going forward
//        }
//        head2=head2.next;
//        return head2;
//    }



   // Checking that the given list is Palindrome list or not

    public boolean isPalindrome() {
        Node slow = head;
        Node slowpre = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
            slowpre=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow ; // this mid will point to the second mid in case of even and middle in case of odd
        if(slowpre!=null) {
            slowpre.next=null;
        }
        Node pre = null ;
        Node current = mid;
        Node next = null;
        while(current!=null) {
            next = current.next;
            current.next=pre;
            pre=current ;
            current=next;


        }
        Node left = head;
        Node right = pre;
        while(left!=null && right!=null) {
            if(left.value!=right.value) return false;
            left = left.next;
            right=right.next;
        }

        return true;


    }




    public void bubble_sort(int start, int count) {
        if(count==0) {
            return ;
        }
        if(count-1>start) {
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

            bubble_sort(start+1 , count);
        }
        else {
            bubble_sort(0, count - 1); }
    }



    public void Insert(int val, int index) {
        if(index==0) {
            InsertFirst(val);
            return;
        }
        else if(index==size) {     // here size is the number of nodes currently in the list , therefore it is always index+1
            InsertFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;
    }


    public int delfirst() {
        int val = head.value;
        head = head.next;
        if(head==null) {     // this prevents the case when there is a single element in the list
            tail=null;
        }
        size--;
        return val;
    }

    public int delLast() {
        if(size<=1) {
            return delfirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail=secondlast;
        tail.next=null;
        size--;
        return val;

    }
    public int del(int index) {
        if(index==0) {
            delfirst();
        }
        else if(index==size-1) {
            delLast();
        }
        Node node = get(index-1);
        int val = node.next.value;
        node.next=node.next.next;
        return val;

    }


    public Node find(int value) {
        Node node = head;
        while(node!=null) {
            if(node.value==value) {
                return node;
            }
            node=node.next;
        }
        return null;
    }


    public Node get(int index) {
        if(index < 0 || index >= size) return null;
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;
    }



    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertRec(int val, int index) {
        head= rec_ins(val,index,head);
    }

    private Node rec_ins(int val, int index, Node node) {
        if(index==0) {
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        if(node==null) {
            System.out.println("Index out of bound");
            return null;
        }
        node.next= rec_ins(val,index-1,node.next);
        return node;
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

    public static LL merge(LL list1, LL list2) {
        Node f = list1.head;
        Node s = list2.head;
        LL list3 = new LL();

        while(f!=null && s!=null) {
            if (f.value < s.value) {
                list3.InsertLast(f.value);
                f = f.next;
            } else {
                list3.InsertLast(s.value);
                s = s.next;
            }
        }
            while(f!=null) {
                    list3.InsertLast(f.value);
                    f = f.next;
            }
            while(s!=null) {
                    list3.InsertLast(s.value);
                    s=s.next;

                }
        return list3;

    }

    // finding the middle of list
    public Node mid(LL list1) {
        list1.head= head;
        Node pre=null ;

        while(head!=null && head.next!=null) {
            pre= (pre==null) ? head : pre.next ;
            head=head.next.next;
        }
        Node mid = pre.next;
        pre.next=null;
        System.out.println("the value of mid is "+mid.value);
        return mid;      // will return the next of middle

    }

    // we have to apply the sam process as we do in merge sort there is a merge function which merges the two given lists and another function which creates those two lists that is left and right




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
