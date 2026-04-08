package com.harshit.Tree.Binary;
import java.util.Locale;
import java.util.Scanner;


public class BT {
    // made a root node
    public Node root;
    public BT() { }

// this will gonna be the structure of our tree:
    private static class Node {
        int value;
        Node left ;
        Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    // insertion of elements
    public void populate(Scanner input) {
        System.out.print("Enter the root value: ");
        int value = input.nextInt();
        root = new Node(value);
        populate(input, root);
    }
    private void populate(Scanner input, Node node) {
        System.out.print("Do you want to add in the left of "+node.value+"-> ");
        String addleft = input.next().toLowerCase();
        if(addleft.equals("y")) {
            System.out.print("Enter the left value of "+node.value+": ");
            int leftvalue = input.nextInt();
            node.left = new Node(leftvalue);
            populate(input, node.left);
        }

        System.out.print("Do you want to add in the right of "+node.value+": ");
        String  addright = input.next();
        if(addright.equals("y")) {
            System.out.print("Enter the right value of "+node.value+" ->");
            int rightvalue = input.nextInt();
            node.right= new Node(rightvalue);
            populate(input, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if(node==null) return;
        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");

    }


    public void preetydisplay() {
        preetydisplay(root,0);
    }
    public void preetydisplay(Node node, int level) {
        if(node==null) return ;
        preetydisplay(node.right, level+1);
        if(level!=0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--->"+node.value);
        }
        else {
            System.out.println(node.value);

        }
        preetydisplay(node.left, level+1);
    }

}
