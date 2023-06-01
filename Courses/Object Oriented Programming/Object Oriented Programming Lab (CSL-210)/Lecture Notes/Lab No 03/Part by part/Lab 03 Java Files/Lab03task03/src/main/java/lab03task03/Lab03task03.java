package lab03task03;

import java.util.Scanner;

public class Lab03task03 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Computer c1 = new Computer();
        
        System.out.print("Enter the name: ");
        c1.setName(in.nextLine());
        System.out.print("Enter the type: ");
        c1.setType(in.nextLine());
        System.out.print("Enter the processor: ");
        c1.setProcessor(in.nextLine());
        System.out.print("Enter the Ram: ");
        c1.setRam(in.nextLine());
        System.out.print("Enter the Hard Disk: ");
        c1.sethardDisk(in.nextLine());
        System.out.print("Enter the Mother Board: ");
        c1.setmotherBoard(in.nextLine());
        
        c1.Display(); 
        c1.Update();
        c1.Display();
    }
}
