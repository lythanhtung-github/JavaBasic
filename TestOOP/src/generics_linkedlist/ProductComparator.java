package generics_linkedlist;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2){
        return p1.getName().compareTo(p2.getName());
    }
}
