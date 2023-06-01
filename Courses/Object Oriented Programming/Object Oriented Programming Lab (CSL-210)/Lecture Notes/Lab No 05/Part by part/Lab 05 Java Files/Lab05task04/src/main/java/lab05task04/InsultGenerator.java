package lab05task04;

public class InsultGenerator {

    private static String name;
    private static int age;

    InsultGenerator(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void insulted(String name, int age) {
        if (age > 1 && age <= 10) {
            System.out.println("Everyone is sweet");
        }
        if (age >= 11 && age <= 17) {
            System.out.println("They are dweebs");
        }
        if (age >= 18 && age <= 20) {
            System.out.println("They are counting down to legal age");
        }
        if (age == 21) {
            System.out.println("They just made legal age");
        }
        if (age >= 22 && age <= 29) {
            System.out.println("They are counting down to 30");
        }
        if (age >= 30 && age <= 40) {
            System.out.println("They are suffering adults");
        }
        if (age >= 41 && age < 50) {
            System.out.println("They are miserable adults");
        }
        if (age >= 50) {
            System.out.println("50 you a speechless!");
        }
    }
}
