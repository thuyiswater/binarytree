public class Main {

    public static void main(String[] args) {
	    BSTree tree= new BSTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(34);
        tree.insert(3);
        tree.insert(1);
        //tree.print();
        //.printPreOrder();
        //tree.printInOrder();
        tree.printPostOrder();
    }
}
