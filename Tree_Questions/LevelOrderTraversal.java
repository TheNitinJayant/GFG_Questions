package GFG_Questions.Tree_Questions;

import GFG_Questions.Tree.BinaryTree;
import GFG_Questions.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public void printLevel(TreeNode root){

        if(root==null){
            return;
        }

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
            System.out.println(current.key);
        }
    }

    public void mainPrintLevel(){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();

        printLevel(root);
    }
}
