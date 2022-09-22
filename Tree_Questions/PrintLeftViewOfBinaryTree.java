package GFG_Questions.Tree_Questions;


import GFG_Questions.Tree.*;

public class PrintLeftViewOfBinaryTree {

    static int maxLevel = 0;
    public void printLeft(TreeNode root, int level){

        if(root==null){
            return;
        }

        if(maxLevel<level){
            System.out.println(root.key + " ");
            maxLevel = level;
        }

        printLeft(root.left, level+1);
        printLeft(root.right, level+1);
    }

    public void printLeftView(TreeNode node){
        printLeft(node, 1);
    }

    public void mainPrintLeftViewOfBinaryTree(){

        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        printLeftView(root);
    }

}
