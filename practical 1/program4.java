class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Base class
class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    double calculatePay() {
        return salary;
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    double calculatePay() {
        return salary + 5000;
    }
}

// Derived class 2
class PartTimeEmployee extends Employee {

    int hours;
    double rate;

    PartTimeEmployee(int hours, double rate) {
        super(0);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculatePay() {
        return hours * rate;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Method Overloading
        System.out.println("METHOD OVERLOADING");

        Calculator cal = new Calculator();

        System.out.println("Addition of 2 integers: "
                + cal.add(10, 20));

        System.out.println("Addition of 3 integers: "
                + cal.add(10, 20, 30));

        System.out.println("Addition of 2 doubles: "
                + cal.add(10.5, 20.5));

        // Method Overriding
        System.out.println("\nMETHOD OVERRIDING");

        Employee emp;

        emp = new FullTimeEmployee(30000);
        System.out.println("Full Time Employee Pay: "
                + emp.calculatePay());

        emp = new PartTimeEmployee(40, 200);
        System.out.println("Part Time Employee Pay: "
                + emp.calculatePay());

        // Explanation
        System.out.println("\nPOLYMORPHISM");
        System.out.println("Overloading: Compile-time polymorphism");
        System.out.println("Overriding: Runtime polymorphism");
    }
}
