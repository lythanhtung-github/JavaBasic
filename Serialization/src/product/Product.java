package product;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String NSX;
    private int price;

    private Product() {
    }

    public Product(int id, String name, String NSX, int price) {
        this.id = id;
        this.name = name;
        this.NSX = NSX;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", NSX='" + NSX + '\'' +
                ", price=" + price +
                '}';
    }
}
