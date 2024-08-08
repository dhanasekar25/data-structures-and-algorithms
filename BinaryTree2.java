class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

 public class BinaryTree2 {
    TreeNode root;

    public BinaryTree2() {
        root = null;
    }

   
    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        
       
        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);
    }
    public void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }  
        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public void postorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.value + " ");

    }
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.left.right = new TreeNode(9);
        tree.root.left.left.right.left = new TreeNode(1);
        tree.root.right.left=new TreeNode(7);
        tree.root.right.right = new TreeNode(6);
        tree.root.right.right.left = new TreeNode(8);
        
        System.out.println("Inorder Traversal of the tree:");
        tree.inorderTraversal(tree.root); 
        System.out.println("\nPreorder Traversal of the tree:");
        tree.preorderTraversal(tree.root);
        System.out.println("\nPostorder Traversal of the tree:");
        tree.postorderTraversal(tree.root);
    }
}

