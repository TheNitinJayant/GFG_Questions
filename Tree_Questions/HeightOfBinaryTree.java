package GFG_Questions.Tree_Questions;

import GFG_Questions.Tree.BinaryTree;
import GFG_Questions.Tree.TreeNode;

public class HeightOfBinaryTree {

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            return ( Math.max( height(root.left), height(root.right) ) + 1 );
        }
    }

    public void mainHeightOfBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        System.out.println(height(root));
    }
}
