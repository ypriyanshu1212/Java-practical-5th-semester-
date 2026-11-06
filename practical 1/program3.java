interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple inheritance using interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Hybrid inheritance
class Machine {
    void start() {
        System.out.println("Machine is starting...");
    }
}

class Computer extends Machine implements Printable {

    public void print() {
        System.out.println("Computer is printing...");
    }

    void display() {
        System.out.println("This is a Computer.");
    }
}

public class Program3 {
    public static void main(String[] args) {

        System.out.println("MULTIPLE INHERITANCE USING INTERFACES");

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println("\nHYBRID INHERITANCE");

        Computer computer = new Computer();
        computer.start();
        computer.display();
        computer.print();

        System.out.println("\nEXPLANATION");
        System.out.println("Java supports multiple inheritance through interfaces.");
        System.out.println("Java does not support multiple inheritance through classes.");
    }
}
