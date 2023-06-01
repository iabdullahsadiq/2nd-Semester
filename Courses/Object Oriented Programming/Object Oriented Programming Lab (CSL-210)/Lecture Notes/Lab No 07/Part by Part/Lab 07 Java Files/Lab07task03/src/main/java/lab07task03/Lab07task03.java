package lab07task03;

public class Lab07task03 {

    public static void main(String[] args) {
        Fresh Banana = new Fresh("mango",60,"Fruit","29/04/2023");
        Frozen Icecream = new Frozen("XYZ", 15, "Ice Cream", "29/04/2023");
        Cosmetics cosmetics = new Cosmetics("cream", 3000, "XYZ");
        Electronics Laptop = new Electronics("Dell_Latitude", 48000,"Dell");
        Pharmacy Painkiller = new Pharmacy("Panadol",50,"GSK");
        Cloth cloth = new Cloth("Dress Coat",8000,"Cotton");        
        System.out.println("Top Products:");
        System.out.println("Frozen Product: "+Icecream.getname() +" is of "+Icecream.getCategory()+" category. It costs "+Icecream.getprice()+" and it expires on "+Icecream.getexpirydate());
        System.out.println("Fresh Product: "+Banana.getname()+" is of "+Banana.getCategory()+" category. It costs "+Banana.getprice()+" and it expires on "+Banana.getexpirydate());
        System.out.println("Cosmetics item: "+cosmetics.getbrand()+" "+cosmetics.getname()+" costs "+cosmetics.getprice());
        System.out.println("Electronics item: "+Laptop.getname()+" manufactured by "+Laptop.getmanufacturer()+" costs "+Laptop.getprice());
        System.out.println("Pharmacuetical item: "+Painkiller.getname()+" manufactured by "+Painkiller.getmanufacturer()+" costs "+Painkiller.getprice());
        System.out.println("Clothes: "+cloth.getname()+" made of "+cloth.getmaterial()+" costs "+cloth.getprice());
    }
}