package ProductMagamentLinkedList;

import java.util.LinkedList;

import static java.util.Comparator.*;

public class ProductManager {
    private final LinkedList<Product> products = new LinkedList<>();

    public ProductManager() {
    }

    public void add(String name, int price) {
        products.add(new Product(name, price));
    }

    public void update(int ID, String name, int price) {
        for (int i = 0; i < products.size(); i++) {
            if (ID == products.get(i).getId()) {
                products.get(i).setName(name);
                products.get(i).setPrice(price);
                products.set(i, products.get(i));
            }
        }
    }

    public void delete(int ID) {
        products.removeIf(item -> item.getId() == ID);
    }

    public void render() {
        for (Product item : products) {
            System.out.println(item.toString());
        }
    }

    public void find(String name) {
        for (Product item : products) {
            if ((item.getName().toUpperCase()).equals(name.toUpperCase())) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Not find");
    }

    public void ascendingSort() {
        products.sort(comparingInt(Product::getPrice));
        for (Product element : products) {
            System.out.println(element.toString());
        }
    }

    public void descendingSort() {
        products.sort((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice()));
        for (Product element : products) {
            System.out.println(element.toString());
        }
    }
}

