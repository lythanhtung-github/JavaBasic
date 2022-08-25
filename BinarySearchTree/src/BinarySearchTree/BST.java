package BinarySearchTree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.element + " ");
        inOrder(root.right);
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }

    protected void preOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    @Override
    public void postOrder() {
        postOrder(root);
    }

    protected void postOrder(TreeNode<E> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.element + " ");
    }

    public TreeNode<E> deleteNode(TreeNode<E> root, E data) {
        if (root == null) return root;
        if (data.compareTo(root.element) < 0) {
            root.left = deleteNode(root.left, data);
        } else if (data.compareTo(root.element) > 0) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                size--;
                return root.right;
            } else if (root.right == null) {
                size--;
                return root.left;
            }
            root.element = minValue(root.right);
            root.right = deleteNode(root.right, root.element);
        }
        return root;
    }

    public void delete(E key) {
        root = deleteNode(root, key);
    }

    public E minValue(TreeNode<E> root) {
        E minValue = root.element;
        while (root.left != null) {
            minValue = root.left.element;
            root = root.left;
        }
        return minValue;
    }

    public boolean searchNode(TreeNode<E> root, E key) {
        if (root == null) return false;

        if (key.compareTo(root.element) == 0)
            return true;
        if (key.compareTo(root.element) < 0) searchNode(root.right, key);
        else if (key.compareTo(root.element) > 0) searchNode(root.left, key);
        return false;
    }

    public void search(E key) {
        if(searchNode(root,key)){
            System.out.printf("%s có trong cây nhị phân", key);
            return;
        }
        System.out.printf("%s không có trong cây nhị phân", key);
    }
}
