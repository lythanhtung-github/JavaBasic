package ProductMagamentArraylist;

public class Product implements Comparable<Product> {
    private int id;
    private static int count = 0;
    private String name;
    private int price;

    public Product(String name, int price) {
        count++;
        this.id = count;
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
        return "Product{" +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getName().compareTo((product.getName()));
    }
}
