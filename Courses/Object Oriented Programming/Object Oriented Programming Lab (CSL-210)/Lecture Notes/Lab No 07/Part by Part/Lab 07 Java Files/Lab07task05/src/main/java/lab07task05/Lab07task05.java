package lab07task05;

public class Lab07task05 {

    public static void main(String[] args) {
        
        System.out.println("Fruits and vegetable shop:\n");
        System.out.println("------------Weighed Item--------------");
        WeightedItems w1 = new WeightedItems("Mangoes",200,3.5);
        System.out.println("Price of "+w1.getname()+" is "+w1.getprice());
        System.out.println(w1.toString());
        System.out.println("------------Counted Item--------------");
        CountedItems c1 = new CountedItems("Banana",64,6);
        System.out.println("Price of "+c1.getname()+" is "+c1.getPrice());
        System.out.println(c1.toString()); 
    }
}