package lab04task04;

public class Lab04task04 {

    public static void main(String[] args) {

        Flight f1 = new Flight("trw324", "KARACHI", "ISLAMABAD", 87);
        Flight f2 = new Flight("tewu324", 90);
        Flight f3 = new Flight("trw324");
        f1.reserve(80);
        f2.reserve(95);
        f3.reserve(67);
        f1.cancel(10);
        f2.cancel(30);
        f3.cancel(78);
        System.out.println(f1.tostring());
        System.out.println(f2.tostring());
        System.out.println(f3.tostring());
        boolean a = f1.equals(f2);
        if (a == true) {
            System.out.println(f1.fno + " AND " + f2.fno + "FLIGHTS ARE EQUAL");
        } else {
            System.out.println(f1.fno + " AND " + f2.fno + "FLIGHTS ARE NOT EQUAL");
        }
        boolean b = f1.equals(f3);
        if (b == true) {
            System.out.println(f1.fno + " AND " + f3.fno + "FLIGHTS ARE EQUAL");
        } else {
            System.out.println(f1.fno + " AND " + f3.fno + "FLIGHTS ARE NOT EQUAL");
        }
    }
}
