package lab07task04;

public class Lab07task04 {

    public static void main(String[] args) {

        System.out.println("PAKISTANI: ");
        Biryani biryani = new Biryani();
        biryani.setname("Biryani");
        biryani.setquantity(2);
        biryani.setprice(700.0);
        biryani.settype("Spicy");
        biryani.setmeat("Chicken");
        biryani.Display();
        Karahi karahi = new Karahi();
        karahi.setname("Mutton Karahi");
        karahi.setquantity(4);
        karahi.setprice(1500.0);
        karahi.settype("Mild");
        karahi.setspiceLevel("Medium");
        karahi.Display();
        System.out.println("BBQ:");
        BBQ bbq = new BBQ();
        bbq.setname("Beef Kabab");
        bbq.setquantity(6);
        bbq.setprice(800.0);
        bbq.setSauce("Mint Chutney");
        bbq.Display();
        System.out.println("CHINESE:");
        Chinese chinese = new Chinese();
        chinese.setname("Sweet and Sour Chicken");
        chinese.setquantity(4);
        chinese.setprice(1200.0);
        chinese.setStyle("Cantonese");
        chinese.Display();
    }
}