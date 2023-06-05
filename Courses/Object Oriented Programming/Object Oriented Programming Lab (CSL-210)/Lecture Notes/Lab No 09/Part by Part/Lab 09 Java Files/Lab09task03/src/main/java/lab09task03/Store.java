package lab09task03;
import java.util.*;
public class Store {

    String name;
    private List<Product> products;

    public Store(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }
}