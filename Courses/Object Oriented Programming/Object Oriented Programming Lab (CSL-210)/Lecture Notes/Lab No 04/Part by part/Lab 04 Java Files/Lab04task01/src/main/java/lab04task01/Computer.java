package lab04task01;

import java.util.Scanner;

public class Computer {

    private String name, processor, type, ram, hdd, mobo;
    Scanner sc = new Scanner(System.in);

    public void setname() {
        System.out.println("Enter the name of computer:");
        this.name = sc.nextLine();
    }
    public void setcpu() {
        System.out.println("Enter the processor of computer:");
        this.processor = sc.nextLine();
    }
    public void settype() {
        System.out.println("Enter the type of computer:");
        this.type = sc.nextLine();
    }
    public void setram() {
        System.out.println("Enter the ram of computer:");
        this.ram = sc.nextLine();
    }
    public void sethdd() {
        System.out.println("Enter the hdd of computer:");
        this.hdd = sc.nextLine();
    }
    public void setmobo() {
        System.out.println("Enter the mobo of computer:");
        this.mobo = sc.nextLine();
    }
    public String getname() {
        return this.name;
    }
    public String getcpu() {
        return this.processor;
    }
    public String gettype() {
        return this.type;
    }
    public String getram() {
        return this.ram;
    }
    public String gethdd() {
        return this.hdd;
    }
    public String getmobo() {
        return this.mobo;
    }
    public void display() {
        System.out.println("\tPC INFO");
        System.out.println("Name:" + getname() + "\nPROCESSOR:" + getcpu() + "\nTYPE:" + gettype() + "\nRAM:" + getram() + "\nHARDDISk:" + gethdd() + "\nMOTHER BOARD:" + getmobo());
    }
    public void update() {
        System.out.println("DO YOU WANT TO UPDATE ANY THING?");
        String choice = sc.nextLine().toLowerCase();
        if (choice.contentEquals("yes")) {
            System.out.println("WHAT DO YOU WANT TO UPDATE?\n1.Name\n2.Processor\n3.Type\n4.RAM\n5.HardDisk\n6.MotherBoard");
            String option = sc.nextLine().toLowerCase();
            switch (option) {
                case "1", "name", "1.name", "1name" -> {
                    setname();
                    display();
                    update();
                }
                case "2", "processor", "2.processor", "2processor" -> {
                    setcpu();
                    display();
                    update();
                }
                case "3", "type", "3.type", "3type" -> {
                    settype();
                    display();
                    update();
                }
                case "4", "ram", "3.ram", "3ram" ->  {
                    setram();
                    display();
                    update();
                }
                case "5", "harddisk", "5.harddisk", "5harddisk" -> {
                    sethdd();
                    display();
                    update();
                }
                case "6", "motherboard", "6.motherboard", "6motherboard" -> {
                    setmobo();
                    display();
                    update();
                }
                default -> {
                    System.out.println("YOU ENTERED AN UNLISTED OPTION...");
                }
            }
        }
    }
}
