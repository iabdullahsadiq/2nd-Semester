package lab04task03;

public class Rectangle {
    
    private int length;
    private int breadth;
    
    Rectangle (){
        
        length = 6;
        breadth = 2; 
    }
     Rectangle (int L, int b){
        
        length = L;
        breadth = b; 
    } 
    public void Display() {

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}
