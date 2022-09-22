package GFG_Questions.Tree_Questions;

import GFG_Questions.Tree.BinaryTree;
import GFG_Questions.Tree.TreeNode;

public class BalancedBinaryTree {

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            return ( Math.max( height(root.left), height(root.right) ) + 1 );
        }
    }

    public boolean isBalancedBinaryTree(TreeNode root){
        if(root==null){
            return true;
        }
        else {
            return ( Math.abs( height(root.left) - height(root.right) ) <= 1 );
        }
    }

    public int isBalancedBinaryTreeWithHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh = isBalancedBinaryTreeWithHeight(root.left);
        if(lh==-1){
            return -1;
        }
        int rh = isBalancedBinaryTreeWithHeight(root.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        else {
            return Math.max(lh,rh) + 1;
        }
    }

    public void mainBalancedBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        System.out.println(isBalancedBinaryTree(root));
    }
}
