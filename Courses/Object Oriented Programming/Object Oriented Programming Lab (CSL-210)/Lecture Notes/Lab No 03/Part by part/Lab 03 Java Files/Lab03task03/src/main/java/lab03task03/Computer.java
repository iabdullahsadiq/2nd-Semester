package lab03task03;

import java.util.Scanner;

public class Computer {

    static Scanner in = new Scanner(System.in);

    private String name, type, processor, ram, hardDisk, motherBoard;
    char rep;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    } 
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String gethardDisk() {
        return name;
    }
    public void sethardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }
    public String getmotherBoard() {
        return motherBoard;
    }
    public void setmotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }
    public void Display() {

        System.out.println("  -System Specification-");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Processor: " + processor);
        System.out.println("Ram: " + ram);
        System.out.println("Hard Disk: " + hardDisk);
        System.out.println("Mother Board: " + motherBoard);
        
    }
    public void Update(){
        
        System.out.println("\nDo you want to update any Feature?");
        System.out.println("Reply y for Yes, n for No.....");
        rep = in.next().charAt(0);
        
        if (rep == 'y' || rep == 'Y') {
            System.out.println("Which of the following do you want to update?");
            System.out.println("a) Name\nb) Type\nc) Processor\nd) Ram\ne) Hard Disk\nf) Mother Board");
            System.out.println("Please reply from a to f.......");

            rep = in.next().charAt(0);

            switch (rep) {
                case 'a', 'A':
                    System.out.print("Enter the name: ");
                    name = in.next();
                    break;
                case 'b', 'B':
                    System.out.print("Enter the type: ");
                    type = in.next();
                    break;
                case 'c', 'C':
                    System.out.print("Enter the processor: ");
                    processor = in.next();
                    break;
                case 'd', 'D':
                    System.out.print("Enter the Ram: ");
                    ram = in.next();
                    break;
                case 'e', 'E':
                    System.out.print("Enter the Hard Disk: ");
                    hardDisk = in.next();
                    break;
                case 'f', 'F':
                    System.out.print("Enter the Mother Board: ");
                    motherBoard = in.next();
                    break;
                default:
                    System.out.println("Invalid Input! Please reply from a to f.......");
                    break;
            }
        } else if (rep == 'n' || rep == 'N') {
            System.out.println("Have a nice Day");
        } else {
            System.out.println("Invalid Input! Please reply with y or n.......");
        }
    }
}
