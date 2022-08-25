package BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        System.out.println("Inorder (sorted): ");
        tree.inOrder();
        System.out.println("Post Order (sorted)");
        tree.postOrder();
        System.out.println("Pre Order (sorted)");
        tree.preOrder();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println("-------------------------------------------------------------------------");

        BST<Integer> duyetCay = new BST<>();
        duyetCay.insert(27);
        duyetCay.insert(14);
        duyetCay.insert(10);
        duyetCay.insert(19);
        duyetCay.insert(35);
        duyetCay.insert(31);
        duyetCay.insert(42);
        duyetCay.inOrder();
        System.out.println("The number of nodes is: " + tree.getSize());
        duyetCay.delete(27);
        duyetCay.inOrder();

        System.out.println("-----------------------------");
        duyetCay.search(31);
    }
}
