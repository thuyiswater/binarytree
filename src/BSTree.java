import java.util.LinkedList;
import java.util.Queue;

public class BSTree {
    TreeNode root;

    public BSTree() {
        this.root = null;
    }

    public TreeNode insertNode(TreeNode root, int data) {
        if(root == null) {
            root = new TreeNode(data);
            return  root;
        }

        if(data < root.data) {
            root.left = insertNode(root.left, data);
        }else if(data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public void insert(int data) { root = insertNode(root, data);}

    public void printTree(TreeNode root) {
        if(root != null) {
            printTree(root.left);
            System.out.printf("%d, ", root.data);
            printTree(root.right);
        }
    }

    public void print() {printTree(root);}

    public void preOrder(TreeNode root) {
        if(root != null) {
            System.out.println(" " + root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void printPreOrder() {preOrder(root);}

    void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(" " + root.data);
            inOrder(root.right);
        }
    }

    public void printInOrder() {inOrder(root);}

    void postOrder(TreeNode root) {
        if(root !=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(" " + root.data);
        }
    }

    public void printPostOrder() {postOrder(root);}

    public void breadthFirst() {
        Queue<TreeNode> queue = new LinkedList<>();

        if(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.println(" " + node.data);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }

}
