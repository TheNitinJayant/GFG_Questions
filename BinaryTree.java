package GFG_Questions;

class TreeNode{
    int key;
    TreeNode left;
    TreeNode right;

    TreeNode(){
        this.key = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data){
        this.key = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = new TreeNode();
    }

    BinaryTree(int key){
        root = new TreeNode(key);
    }

    public void insert(int data){
        TreeNode newNode = new TreeNode(data);
        if (root==null){
            root=newNode;
        }
        else {
            root.left = newNode;
        }
    }

    public void insertLeft(int data){

    }

    public void insertRight(){

    }

    public void display(){

    }

    public void display(TreeNode tree){
        if(tree==null){
            return;
        }
        System.out.println(tree.key);
        display(tree.left);
        display(tree.right);
    }

    public void testBinaryTree(){
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insert(20);
        binaryTree.display(binaryTree.root);
    }
}
