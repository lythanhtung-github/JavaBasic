package bt_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = DEFAULT_CAPACITY;
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
        this.size = capacity;
    }

    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element) {
        if (this.size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index > elements.length - 1 || index < 0) {
            System.out.println("Index is not validation");
        } else {
            if (elements[index] == null) {
                elements[index] = element;
            } else {
                ensureCapa();
                for (int i = elements.length - 1; i > index; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = element;
            }
        }
    }

    public void remove(int index) {
        if (index > elements.length - 1 || index < 0) {
            System.out.println("Index is not validation");
        } else {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[elements.length - 1] = null;
            size--;
        }
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        MyList<E> clone = new MyList<>(elements.length);
        for (Object element : elements) {
            clone.add((E) element);
        }
        return (E) clone;
    }

    public boolean contains(E obj) {
        for (Object x : elements) {
            if (obj.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //    public boolean add(int index, E element) {
//        boolean result;
//        if (index > elements.length - 1 || index < 0) {
//            result = false;
//        } else {
//            ensureCapa();
//            for (int i = elements.length-1; i >index; i--) {
//                elements[i] = elements[i-1];
//            }
//            elements[index] = element;
//            result = true;
//        }
//        return result;
//    }
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return elements[index];
    }

    public void clear() {
        this.size = 0;
    }


    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
