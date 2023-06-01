package lab04;

public class Student {

    private int id;
    private String name;
    private int age;
    
    Student(){
        
        id = 1;
        name = "Name"; 
    }
    Student(int i, String n){
        
       id = i;
       name = n;
    }
    Student(int i, String n, int a) {

        id = i;
        name = n;
        age = a;
    }
    public void Display() {

        System.out.println(id + ") " + name + " "+ age);
    }
}
