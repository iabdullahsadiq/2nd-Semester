package lab09task03;
import java.util.*;
public class Company {

    String name;
    private List<Store> store;

    public Company(String name, List<Store> store) {
        this.name = name;
        this.store = store;
    }
    public void showallitems() {
        List<Product> product;
        for (Store s : store) {
            System.out.println("\n" + s.name);
            product = s.getProducts();
            for (Product p : product) {
                System.out.println(p.name);
            }
        }
    }
}