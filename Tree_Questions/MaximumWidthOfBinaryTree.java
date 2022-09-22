package GFG_Questions.Tree_Questions;

import GFG_Questions.Tree.BinaryTree;
import GFG_Questions.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {

    public int getMaxWidth(TreeNode root){

        if(root==null){
            return 0;
        }

        int maxWidth = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
            if(queue.size()>maxWidth){
                maxWidth = queue.size();
            }
        }

        return maxWidth;
    }

    public void mainMaximumWidthOfBinaryTree(){

        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        System.out.println(getMaxWidth(root));

    }
}
