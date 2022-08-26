package generics_linkedlist;

public class Product {
    private int id;
    private String name;
    private int price;
    private static int count = 1;

    public Product(String name, int price) {
        this.id = count++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%9s %-11s | %18s %-12s | %15s %-15s", id, " ", name, " ", price, " ");
    }
}
