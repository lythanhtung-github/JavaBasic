package BinarySearchTree;

public interface Tree<E> {
    public boolean insert(E e);

    public void inOrder();
    public void preOrder();
    public void postOrder();

    public int getSize();

}
