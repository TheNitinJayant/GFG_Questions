package GFG_Questions;

import GFG_Questions.Tree.BinaryTree;
import GFG_Questions.Tree.TreeNode;

public class ChildrenSumProperty {
    public boolean hasChildrenSumProperty(TreeNode root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum = 0;

        if(root.left!=null){
            sum = sum + root.left.key;
        }
        if(root.right!=null){
            sum = sum + root.right.key;
        }

        return ( root.key == sum && hasChildrenSumProperty(root.left) && hasChildrenSumProperty(root.right) );
    }


    public void mainChildrenSumProperty(){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        System.out.println(hasChildrenSumProperty(root));
    }
}
