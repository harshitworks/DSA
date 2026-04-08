package com.harshit.Tree.Binary;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BT tree = new BT();
//        tree.populate(input);
//        tree.preetydisplay();


        BST bst = new BST();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        bst.populate(arr);
        bst.display();

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11};
        BST bst2 = new BST();
        bst2.populatesorted(arr2);
        bst2.display();

        // this is the line after the physical damage to my laptop oo my goodness


        // So talking about the traversals then we have three types: Pre-Order , In-Order and Post-Order traversal

        // 1: Pre-Order is used when we have to make a copy of tree or have to mathematical calculations
        // 2. In-Order can be used to get the elements in sorted form if applied on BST
        // 3. Post -Order is used when we have to delete the element or have to perform bottom up calculation

        System.out.println("--------------------");
        BST bst3 = new BST();
        for (int i = 1 ; i < 101; i++) {
            bst3.insert_avl(i);
        }
        bst3.display();
        System.out.println("=================================================");
        bst3.Inorder();   // this is to verify that our tree is Avl or not



        SegmentTree st = new SegmentTree(arr);
        st.display();
        System.out.println("=================================================");
        System.out.println(st.query(1,5));


    }
}
