package tree;

import com.sun.source.tree.Tree;

public class BinaryTreeImplementation {
    private TreeNode root;

    public void createBinaryTree(){
        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(6);
        TreeNode third= new TreeNode(7);
        TreeNode fourth = new TreeNode(8);
        TreeNode fifth = new TreeNode(9);
        TreeNode sixth = new TreeNode(10);
        TreeNode seventh = new TreeNode(11);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    //traversal

    //preOrder Traversal
    public void preOrder(){
        TreeNode curr = root;
        preOrder(curr);
    }
    public void preOrder(TreeNode root){
        if(root == null){     //base case
            return;
        }
        System.out.println(root.data+ "  ");

        //if a recursion is called more than once in that function,
        // it is called tree recursion.
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * output:-
     *                    call stack
     * method call            line number           root
     * preOrder()                40                   5
     *
     */
    class TreeNode{
        private int data; //can be generic type.
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
