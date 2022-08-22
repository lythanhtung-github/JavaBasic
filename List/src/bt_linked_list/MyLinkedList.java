package bt_linked_list;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }
    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        if (head == null)
            addFirst(data);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
            numNodes++;
        }
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    public boolean remove(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.data).equals(data)) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size(){
        return this.numNodes;
    }

    public Object clone(){
        MyLinkedList newList = new MyLinkedList();
        newList.head = head;
        for (Node element = head; element != null; element=element.next){
            newList.addLast(element.getData());
        }
        return newList;
    }

    public boolean contains(Object data) {
        Node temp = head;
        boolean flag = false;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            }
            else {
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.data).equals(data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(Object data) {
        if (head == null)
            addFirst(data);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
            numNodes++;
        }
        return true;
    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        return temp.data;
    }

    public Object getFirst(){
        Node temp = head;
        return temp.data;
    }

    public Object getLast(){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) temp = temp.next;
        return temp.data;
    }

    public void clear() {
        head = null;
        System.out.println("List is empty");
    }

    public void printList() {
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
