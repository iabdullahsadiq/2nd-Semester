package lab05;

public class BSE2B {
    
    private int id;
    private String name;
    private int age;
    static int totalStrength = 40;
    static String uniName = "Bahria";
    
    BSE2B(int id, String name, int age){
        
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public static void changeTotalstrength(int tS){
        
        totalStrength = tS;
    }
    public void Display(){
        
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        System.out.println(totalStrength);
        System.out.println(uniName);
    }
}
