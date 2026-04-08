package com.harshit.Tree.Binary;
import java.util.*;
import java.io.*;
public class Questions {

            Node root;
        // Node creation of Tree:
        public static class Node {
            int val;
            Node left;
            Node right;
            public Node(int val) {
                this.val= val;
                left = null;
                right = null;
            }
        }

    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Questions q = new Questions();
        List<List<Integer>> ans = q.bfs(root);
        System.out.println(ans);
        System.out.println("--------------");

        display(root);
        System.out.println();
        System.out.println("--------------");
        int ans4 = q.nextsuccessor(root, 5).val;
        System.out.println(ans4);



        System.out.println("--------------");
        Questions q2 = new Questions();
        q2.insert(85);
        q2.insert(10);
        q2.insert(40);
        q2.insert(50);
        q2.insert(52);
        q2.insert(80);
        q2.insert(35);
        q2.insert(42);
        q2.insert(20);
        q2.insert(30);
        display(q2.root);
        System.out.println("--------------");
        System.out.println(q2.bfs(q2.root));
        System.out.println("--------------");
        System.out.println(q2.nextsuccessor(q2.root, 20).val);
        System.out.println("------------");
        System.out.println(q2.zig_zag_bfs(q2.root));
        System.out.println("------------");
        System.out.println(q2.cousins(q2.root, 42,52));

        System.out.println("-----------------");
        System.out.println(q2.isSymmetric(q2.root));
        System.out.println("-----------------");
        System.out.println("Common ancestor is "+q2.commonAncestor(q2.root,q2.findNode(q2.root,10),q2.findNode(q2.root,30)).val);


        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        Questions q3 = new Questions();
        Node root3 = q3.buildTree(pre,in);
        System.out.println("The build tree from the arrays: ");
        display(root3);
        System.out.println();

        System.out.println("After Serializing ");
        List<String> list =q3.serialise(root3);
        System.out.println(list);
        System.out.println("After serializing: ");
        Node root4 = q3.deserialize(list);
        display(root4);
        System.out.println(" After both methods");
        display(q3.deserialize(q3.serialise(root)));
        display(root);
        System.out.println();

        System.out.println("👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻👻");
        ///  Questions 2. 0
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] inorder = {4,2,5,1,6,3,7};
        int[] preorder= {1,2,4,5,3,6,7};
        Questions q4 = new Questions();
        Node root5 = q4.buildTree(preorder,inorder);
        System.out.println(q4.verticalTraversal(root5));



    }
    public void insert(int val) {
        root = insert(root, val);
        return;
    }

    public Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }

        return node;
    }


    public static void display(Node node) {
        if(node ==null) return;
        System.out.print(node.val+"  ");
        display(node.left);
        display(node.right);


    }


    public List<List<Integer>> bfs(Node root) {
        List<List<Integer>> result =  new ArrayList<>();
        if(root==null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);
                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }
        return result ;
    }

    public  Node nextsuccessor(Node root , int val) {
            if(root==null) return null;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                Node currNode = queue.poll();
                if(currNode.left!=null) {
                    queue.offer(currNode.left);
                }
                if(currNode.right!=null) {
                    queue.offer(currNode.right);
                }
                if(currNode.val==val) {
                    return queue.poll();
                }
            }


            return null;
    }

    public List<List<Integer>> zig_zag_bfs(Node root) {
            List<List<Integer>> outer = new ArrayList<>();
            if(root==null) return outer;
            Deque<Node> queue = new LinkedList<>();
            boolean reverse = false;
            queue.offer(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                for(int i = 0 ; i < size; i++) {
                    if(!reverse) {
                            Node node = queue.pollFirst();
                            list.add(node.val);
                            if(node.left!=null) {
                                queue.offerLast(node.left);
                            }
                            if(node.right!=null) {
                                queue.offerLast(node.right);
                            }
                    }
                    else {
                            Node node = queue.pollLast();
                            list.add(node.val);
                            if(node.right!=null) {
                                queue.offerFirst(node.right);
                            }
                            if(node.left!=null) {
                                queue.offerFirst(node.left);
                            }
                    }
                }
                reverse = !reverse;
                outer.add(list);

            }
            return outer;
    }

    public boolean cousins(Node node, int x , int y) {
            Node xx = findNode(root,x);
            Node yy = findNode(root,y);
            if(xx == null || yy == null) return false;
            if(siblings(root,xx,yy)) return false;
            return level(root, xx, 0)==level(root, yy, 0);
    }

    public Node findNode(Node node , int val) {
            if(node==null) return null;
            if(node.val==val) return node;

            Node node1 = findNode(node.left, val);
            if(node1!=null) {
                return node1;
            }
            // if still we don;t get node then search in right
           return findNode(node.right, val);
    }

    public boolean siblings(Node node, Node n1 , Node n2 ) {
        if (node == null) return false;
        if ((node.left == n1 && node.right == n2) || (node.left == n2 && node.right == n1)) return true;
        return siblings(node.left, n1, n2) || siblings(node.right, n1, n2);
    }

    public int level(Node node , Node x , int level) {
            if(node==null) {
                return -1 ;
            }
            if(node==x) return level;
            int l = level(node.left, x, level+1);
            if(l!=-1) {   // that means if we found our answer then return it
                return l;
            }
            return level(node.right, x, level+1); // if we donot get the level on the left side then find in the right side
    }
    ///////////////////////////////////////

    public boolean isSymmetric(Node root) {
            if(root==null) return true;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root.left);
            queue.offer(root.right);
            while(!queue.isEmpty()) {
                Node left = queue.poll();
                Node right = queue.poll();
                if(left == null && right == null) continue;
                if(left == null || right == null) return false;
                if(left.val != right.val) return false;
                // adding in the queue
                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);

            }
            return true;
        }

    public Node commonAncestor(Node node,Node p, Node q) {
            if(node==null ) {
                return null;
            }
            if(node==p || node == q) return node;
            Node left = commonAncestor(node.left, p , q);
            Node right = commonAncestor(node.right, p , q);
            if(left!=null && right!=null) {
                return node;
            }
            if(left==null) return right;
        return left;

    }

    public Node buildTree(int[] pre, int[] in) {
            if(pre.length==0) return null;

            int val = pre[0];
            // find the index of root in InOrder traversal
            int index = 0 ;
            for(int i = 0 ; i < in.length ; i++) {
                if(val==in[i]) {
                    index = i;
                }
            }
            Node root = new Node(val);
            root.left = buildTree(Arrays.copyOfRange(pre,1,index+1), Arrays.copyOfRange(in, 0 ,index));
            root.right = buildTree(Arrays.copyOfRange(pre,index+1,pre.length), Arrays.copyOfRange(in, index+1,in.length));
            return root;
    }

    public List<String> serialise(Node root ) {
        List<String> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    public void helper(Node root, List<String> list) {
        if(root==null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        helper(root.left, list);
        helper(root.right,list);

    }

    public Node deserialize(List<String> list) {
         // we reverse the list so that as we remove the element its size got reduces automatically , as remove pop the element from the last
       return helper2(list.reversed());

    }
    public Node helper2(List<String> list) {
        if(list==null || list.isEmpty()) return null;
        String val = list.removeLast();
        if(val.equals("null")) return null;
        int value = Integer.parseInt(val);
        Node root = new Node(value);

        root.left=helper2(list);
        root.right=helper2(list);
        return root;
    }
///  🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
    public List<List<Integer>> verticalTraversal(Node root) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        Queue<Map.Entry<Node, int[]>> queue = new ArrayDeque<>();
        queue.add(new AbstractMap.SimpleEntry<>(root,new int[]{0,0}));
        while(!queue.isEmpty()) {
            Map.Entry<Node , int[]> entry = queue.poll();
            Node node = entry.getKey();
            int row = entry.getValue()[1];
            int col = entry.getValue()[0];

            map.computeIfAbsent(col,k-> new ArrayList<>()).add(new int[]{row, node.val});
            if(node.left!=null) {
                queue.offer(new AbstractMap.SimpleEntry<>(node.left, new int[]{col-1, row+1}));
            }
            if(node.right!=null) {
                queue.offer(new AbstractMap.SimpleEntry<>(node.right, new int[]{col+1, row+1}));
            }

        }
        List<Integer> cols = new ArrayList(map.keySet());
        Collections.sort(cols);
        List<List<Integer>> result = new ArrayList<>();
        for(int col : cols) {
            List<int[]> colList = map.get(col);
            colList.sort((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
            List<Integer> val = new ArrayList<>();
            for(int[] pair: colList) {
                val.add(pair[1]);
            }
            result.add(val);
        }
        return result;
    }









}
