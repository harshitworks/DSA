package com.harshit.Tree.Binary;

public class BST {
    private Node root;

    public BST() {
        // this is a constructor of the class
    }
    public class Node {
      private  int value ;
      private  Node left ;
      private  Node right;
      private  int  height;

        public Node(int value) {
            this.value=value;
        }
    }


    public int getValue(Node node) {
        return  node.value;
    }


    public int height(Node node ) {
        if(node==null) {
            return 0;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public void display() {
        display(root, "Root Node ");
    }

    private void display(Node node, String details) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        if(node==null) {return;}
        System.out.println(details+node.value);
        display(node.left, "Left child of "+node.value+" : ");
        display(node.right, "Right child of "+node.value+" : ");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
}
    public void insert(int value) {
        root=insert(root, value);
    }
    private Node insert(Node node , int value) {
        if(node==null) {
            return new Node(value);
        }
        if(value<node.value) {
            node.left=insert(node.left, value);
        }
        if(value>node.value) {
            node.right=insert(node.right, value);
        }
        node.height=Math.max(height(node.left), height(node.right)) + 1;  // here +1 is because parent height is always one more than the children

        // after the complete traversal and all return the node to previous calls
        return node;
    }

    public void populatesorted(int[] nums) {
        populatesorted(nums,0,nums.length);
    }
    private void populatesorted(int[] nums, int start, int end) {
        if(start>=end) {
            return ;
        }
        int mid = start + (end-start)/2;
        this.insert(nums[mid]);
        populatesorted(nums, start, mid);
        populatesorted(nums, mid + 1, end);
    }


    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if(node==null) {
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }






//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                     // Traversal of TREE:

    public void Preorder() {
            Preorder(root);
    }

    private void Preorder(Node node) {
        if(node==null) {
            return;
        }
        System.out.println(node.value);
        Preorder(node.left);
        Preorder(node.right);
    }

    public void Inorder() {
        Inorder(root);
    }
    private void Inorder(Node node) {
        if(node==null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.value+" ");
        Inorder(node.right);
    }

    public void Postorder() {
        Postorder(root);
    }
    private void Postorder(Node node) {
        if(node==null) {
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.println(node.value);
    }






   /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   //                                            AVL TREE

    public void insert_avl(int value) {
        root = insert_avl(root, value);
    }
    private Node insert_avl(Node node , int value) {
        if(node==null) {
            return new Node(value);
        }
        if(value<node.value) {
            node.left=insert_avl(node.left, value);
        }
        if(value>node.value) {
            node.right=insert_avl(node.right, value);
        }
        else {
            return node;
        }

        node.height=Math.max(height(node.left), height(node.right)) + 1;
        // till here we added the node in the tree as same as wee do earlier now we have to check is it unbalanced or balanced and then balanced it and return the node
        return rotate(node);
    }
    private Node rotate(Node node) {
        if(height(node.left)- height(node.right)> 1) { // left heavy
            // left left case
            if(height(node.left.left)-height(node.left.right)>=0) {
                return Rightrotate(node);
            }
            // left - right case;
            if(height(node.left.right)-height(node.left.left)>0) {  // we can directly use else also here
                node.left = Leftrotate(node.left);
                return Rightrotate(node);

            }
        }
        if(height(node.right)-height(node.left)>1) { // right heavy
            // right - left
            if(height(node.right.left)-height(node.right.right)>=0) {
                node.right=Rightrotate(node.right);
                return Leftrotate(node);
            }
            // right - right case;
            if(height(node.right.right)-height(node.right.left)>0) {   // we can use directly else also here
                return Leftrotate(node);

            }

        }
        return node;
    }

    private Node Rightrotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right= p ;
        p.left=t ;
        // update the height part
        p.height= Math.max(height(p.left), height(p.right)) + 1 ;
        c.height= Math.max(height(c.left), height(c.right)) + 1 ;

        return c ;
    }
    private Node Leftrotate(Node p) {
        Node c = p.right;
        Node t = c.left;
        c.left = p ;
        p.right= t ;
        p.height= Math.max(height(p.left), height(p.right)) + 1 ;
        c.height= Math.max(height(c.left), height(c.right)) + 1 ;
        return c ;
    }






    /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                        SEGMENT TREE :





}
