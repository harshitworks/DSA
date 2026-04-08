package com.harshit.LinkedList.Singly;

public class Main {

    static void main(String[] args) {
        LL list = new LL();

        list.InsertFirst(1);
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertFirst(100);
        list.InsertLast(200);
        list.Insert(20, 5);
        list.Insert(30, 2);
        list.Insert(40, 5);
        list.display();
        System.out.println(list.delfirst());
        list.display();
        System.out.println(list.del(4));
        list.delLast();
        System.out.println(list.find(3));
        list.insertRec(23,1);
        list.insertRec(23,1);
        list.insertRec(23,1);
        list.insertRec(49,3);
        LL list2 = new LL();
        list2.InsertFirst(1);
        list2.InsertFirst(2);
        list2.InsertFirst(2);
        list2.InsertFirst(2);
        list2.InsertFirst(3);
        list2.InsertFirst(4);
        list2.InsertFirst(4);
        list2.InsertFirst(5);
        list2.InsertFirst(6);
        list2.display();
        list2.remove_dup();
        list2.display();

        LL list1 = new LL();
        LL list3 = new LL();
        list1.InsertLast(1);
        list1.InsertLast(3);
        list1.InsertLast(4);
        list1.InsertLast(6);
        list3.InsertLast(3);
        list3.InsertLast(50);
        list3.InsertLast(7);
        list3.InsertLast(71);
        list3.InsertLast(17);
        list3.InsertLast(47);
        LL ans = LL.merge(list1,list3);
        System.out.println(ans);
        ans.display();


        System.out.println(list1.mid(list1));

        System.out.println("the list 3 is sorted");
        list3.display();
        list3.bubble_sort(0,6);
        list3.display();

        System.out.println("Reverse of the list is ");
        list3.reverse();
        list3.display();
        System.out.println("The specific part of list is reversed");
        list3.reverse2(2,5);
        list3.display();

        LL list4 = new LL();
        list4.InsertFirst(1);
        list4.InsertLast(2);
        list4.InsertLast(3);
        list4.InsertLast(3);
        list4.InsertLast(2);
        list4.InsertLast(1);
        System.out.println("---------------------------");
        list4.display();
        System.out.println(list4.isPalindrome());
        list4.display();
        System.out.println("---------------------");


    }


}
