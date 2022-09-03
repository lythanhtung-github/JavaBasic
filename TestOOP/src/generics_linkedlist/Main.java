package generics_linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Product> products = new LinkedList<>();
        products.add(new Product("Cà phê sữa", 20000));
        products.add(new Product("Trà sữa", 25000));
        products.add(new Product("Nước ép cam", 15000));
        products.add(new Product("Cà phê đen", 15000));
        products.add(new Product("Nước chanh", 20000));

        products.addFirst(new Product("Nước lọc", 1000000));
        products.addLast(new Product("Nước đậu", 5000));
        products.removeFirst();
        products.removeLast();
        printArray(products);

        ProductComparator comparator = new ProductComparator();
        products.sort(comparator);
        System.out.println("Sau khi sắp xếp theo tên");
        printArray(products);
    }

    public static void printArray(LinkedList<Product> products) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%10s %-10s | %15s %-15s | %15s %-15s\n", "ID", " ", "Name", " ", "Price", " ");
        System.out.println("-------------------------------------------------------------------------");
        for (Product element : products) {
            System.out.println(element);
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}
