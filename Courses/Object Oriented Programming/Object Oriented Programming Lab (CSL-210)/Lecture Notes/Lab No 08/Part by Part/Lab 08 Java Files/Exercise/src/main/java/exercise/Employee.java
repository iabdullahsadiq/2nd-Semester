package exercise;

public class Employee {
    private String name, address;
    private int number; 
    public Employee(String name, String address, int number){
     this.name = name;
     this.address = address;
     this.number = number;
    }
    public void mailCheck(){
        System.out.println("Mailing Check to " + name + " at " + address);
    }
    public String toString(){
        return name + ", " + address + ", " + number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getNumber(){
        return number;
    }
    public void setName(int number){
        this.number = number;
    } 
}