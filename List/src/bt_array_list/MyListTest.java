package bt_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Object> myList = new MyList<>();

        System.out.println(myList);

        myList.add(0, 0);
        myList.add(1);
        myList.add(1, 1);
        myList.add(2, 2);
        myList.add(3, 3);
        myList.add(4, 5);
        myList.add(4, 4);
        System.out.println(myList);
        myList.add(6, 6);
        myList.add(7, 7);
        myList.add(8, 8);
        myList.add(9, 9);
        myList.add(10, 10);
        System.out.println(myList);

        myList.remove(10);
        System.out.println(myList);

        boolean a = myList.contains(9);
        System.out.println(a);
    }
}
