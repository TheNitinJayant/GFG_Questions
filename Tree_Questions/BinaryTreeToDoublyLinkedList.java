package GFG_Questions.Tree_Questions;

import GFG_Questions.Tree.TreeNode;

public class BinaryTreeToDoublyLinkedList {

    TreeNode previous = null;
    public TreeNode BTToDLL(TreeNode root){

        if(root==null){
            return root;
        }

        TreeNode head = BTToDLL(root.left);

        if(previous==null){
            head = root;
        }
        else {
            root.left = previous;
            previous.right = root;
        }

        previous = root;

        BTToDLL(root.right);

        return head;
    }
}
