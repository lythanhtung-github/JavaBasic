package th_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(5,8);
        ll.add(10,8);

//        ll.add(6,23);
//        ll.add(0,23);
        ll.printList();
    }
}
