package com.harshit.Tree.Binary;

public class DoubleLinkedList {
    LLNode head;
    LLNode tail;

    // Structure of LinkedList
    class LLNode {
        int val ;
        LLNode pre ;
        LLNode next;
        public LLNode(int val) {
            this.val = val;
        }
    }


    // Structure of TreeNode
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    //
    public LLNode convert(TreeNode root) {
        if(root==null) return null;

        helper(root);
        return head;
    }

    private void helper(TreeNode root) {
        if(root==null) return;
        helper(root.left);

        LLNode temp = new LLNode(root.val);
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        helper(root.right);
    }

}
