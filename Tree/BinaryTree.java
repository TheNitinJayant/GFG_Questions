package GFG_Questions.Tree;
public class BinaryTree {

    TreeNode root;

    public BinaryTree(){
        root = new TreeNode();
    }

    BinaryTree(int key){
        root = new TreeNode(key);
    }

    public TreeNode getRoot(){
        return this.root;
    }

    public void insertLeft(TreeNode currentRoot, int data){
        TreeNode newNode = new TreeNode(data);
        TreeNode rootRef = this.root;

        currentRoot.left = newNode;
    }

    public void insertRight(TreeNode currentRoot, int data){
        TreeNode newNode = new TreeNode(data);
        TreeNode rootRef = this.root;

        currentRoot.right = newNode;
    }

    public void display(){
        TreeNode tree = getRoot();

        if(tree==null){
            return;
        }
        System.out.print(tree.key);
        display(tree.left);
        display(tree.right);
    }

    public void display(TreeNode tree){
        if(tree==null){
            return;
        }
        display(tree.left);
        System.out.println(tree.key + " ");
        display(tree.right);
    }

    public TreeNode createTree(){
        BinaryTree binaryTree = new BinaryTree(10);
        TreeNode refNode = binaryTree.getRoot();
        binaryTree.insertLeft(refNode, 20);
        binaryTree.insertRight(refNode,30);
        refNode = refNode.left;
        binaryTree.insertRight(refNode,50);

        return binaryTree.getRoot();
    }

    public void testBinaryTree(){
        BinaryTree binaryTree = new BinaryTree(10);
        TreeNode refNode = binaryTree.getRoot();
        binaryTree.insertLeft(refNode, 20);
        binaryTree.insertRight(refNode,30);
        refNode = refNode.left;
        binaryTree.insertRight(refNode,50);

        binaryTree.display();

        //            10
        //     20             30
        //        50
    }
}
