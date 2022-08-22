package bt_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"LTT");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);

        list.printList();

        String strFind = "LTT";
        int index = list.indexOf(strFind);
        if (index == -1){
            System.out.println("Not find");
        }
        else{
            System.out.printf("Index of '%s' is: %s\n", strFind, index);
        }

        list.clear();
    }
}
