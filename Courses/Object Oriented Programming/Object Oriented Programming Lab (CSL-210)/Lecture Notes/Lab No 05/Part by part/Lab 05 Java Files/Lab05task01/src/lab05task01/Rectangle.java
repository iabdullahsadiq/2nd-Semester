package lab05task01;

public class Rectangle {
    
     private static double  width;
      private static double height;
     
     Rectangle(double height, double width){
        
        this.height = height;
        this.width = width;
    }
     static double Area(){
         double area =height * width;
         return area;          
     }
    public static void Display(){
        
        double Result = Area();
        
        System.out.print("Area: ");
        System.out.println(Result);
    }
}
