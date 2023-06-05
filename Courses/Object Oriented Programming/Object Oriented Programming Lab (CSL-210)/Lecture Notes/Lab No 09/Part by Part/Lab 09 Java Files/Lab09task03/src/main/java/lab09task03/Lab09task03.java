package lab09task03;
import java.util.*;
public class Lab09task03 {

    public static void main(String[] args) {

        Product p1 = new Product("Rice", 200, 80);
        Product p2 = new Product("Sugar", 900, 90);
        Product p3 = new Product("Shampoo", 800, 50);
        Product p4 = new Product("Bread", 500, 40);
        Product p5 = new Product("Soap", 500, 10);
        Product p6 = new Product("Butter", 1000, 30);

        List<Product> branch1_product = new ArrayList<Product>();
        List<Product> branch2_product = new ArrayList<Product>();
        branch1_product.add(p1);
        branch1_product.add(p2);
        branch1_product.add(p5);
        branch2_product.add(p4);
        branch2_product.add(p3);
        branch2_product.add(p6);

        Store store1 = new Store("Karachi Branch", branch1_product);
        Store store2 = new Store("Punjab Branch", branch2_product);
        List<Store> Store = new ArrayList<Store>();
        Store.add(store1);
        Store.add(store2);
        Company C1 = new Company("ABC", Store);
        C1.showallitems();
    }
}