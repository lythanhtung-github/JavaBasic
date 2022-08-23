import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    //THÊM PHẦN TỬ VÀO TRÊN CÙNG
    public void push(T element) {
        stack.addFirst(element);
    }

    //TRẢ VỀ VÀ XÓA PHẦN TỬ TRÊN CÙNG
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
