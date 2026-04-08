package com.harshit.Tree.Binary;

public class SegmentTree {
    private Node root ;

    // structure of the Node of segment tree:
    private static class Node {
        Node left ;
        Node right;
        int  data ;
        int startInterval ;
        int endInterval;

        public Node(int start , int end) {
            this.startInterval = start ;
            this.endInterval = end ;
        }
        public Node(int value) {
            this.data = value;
        }
    }
    public SegmentTree(int[] arr) {
        this.root= constructTree(arr, 0 , arr.length-1);
    }

    private Node constructTree(int[] arr , int start , int end) {
        // base condition when we reach till leaf node
        if(start==end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        // create a new Node
        Node node = new Node(start, end);

        int mid = start+ (end-start)/2;
        node.left = constructTree(arr, start , mid);
        node.right = constructTree(arr, mid+1, end);

        node.data = node.left.data+ node.right.data;

        return node;
    }

    public void display() {
        display(root );
    }
    private void display(Node node ) {
        String str = "";

        // for  current node
        str += "["+node.startInterval+"-"+node.endInterval+"] :"+ node.data;

        if(node.left!=null) {
            str += " ["+node.left.startInterval+"-"+node.left.endInterval+"] ==>"+node.data;
        }
        else {
            str +=  "Node "+node.data+" has no left child";
        }
        if(node.right!=null) {
            str += " ["+node.right.startInterval+"-"+node.right.endInterval+"] ==>"+node.data;
        }
        else {
            str +=  "Node "+node.data+" has no right child";
        }
        System.out.println(str);

        // recursion
        if(node.left!=null) {
            display(node.left);
        }
        if(node.right!=null) {
            display(node.right);
        }

    }

    // lets move to query :
    public int query(int qst, int qed) {
        return query(this.root, qst, qed);
    }

    private int query(Node node, int qst, int qed) {
        if(node==null) {
            return 0;
        }
        if(node.startInterval > qed || node.endInterval < qst) { // query is outside
            return 0 ;
        }
        else if(node.startInterval >= qst && node.endInterval <= qed) { // query is inside completely
            return node.data;
        }
        else { // case of overlapping
            return this.query(node.left, qst, qed) + this.query(node.right, qst, qed);

        }
    }


    // update the value at particular index
    public void update(int index, int value) {
        this.root.data=update(this.root, index, value);
    }
    private int update(Node node, int index , int value) {
        // if index is in range
        if(index>= node.startInterval && index<=node.endInterval) {
            //  base condition that is when we reach at leaf node and we have to update the value of that node
            if(index == node.startInterval && node.startInterval==node.endInterval)  {
                node.data = value;
                return node.data;
            }
            else { // here index is in range but range contains many indices so go for its children
                int left = update(node.left, index , value);
                int right = update(node.right, index , value);
                node.data = left + right ;
                return node.data;

            }
        }
        else { // index out of the range , can't update
            return node.data;

        }

    }






}
