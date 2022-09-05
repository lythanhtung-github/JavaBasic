package product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    private static ProductManager instance;

    public static ProductManager getInstance() {
        if (instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }

    private ProductManager() {
    }

    public void add(int id, String name, String NSX, int price) throws IOException {
        products.add(new Product(id, name, NSX, price));
        FileManager.writeToFile("E:\\GitHub\\JavaBasic\\Serialization\\src\\product\\products.data", products);
    }

    public void show() {
        products = FileManager.readDataFromFile("E:\\GitHub\\JavaBasic\\Serialization\\src\\product\\products.data");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public boolean search(int id) {
        products = FileManager.readDataFromFile("E:\\GitHub\\JavaBasic\\Serialization\\src\\product\\products.data");
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(product);
                return true;
            }
        }
        return false;
    }
}