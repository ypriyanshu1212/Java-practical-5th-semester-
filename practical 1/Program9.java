class Employee {
    String employeeName;
    double salary;

    // Static variable to count employees
    static int employeeCount = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized constructor
    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;

        employeeCount++;
    }

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Salary: Rs. " + this.salary);
        System.out.println("--------------------------");
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 30000);

        Employee e3 = new Employee("Priya", 45000);

        System.out.println("Employee Details:");

        e1.display();
        e2.display();
        e3.display();

        Employee.displayCount();
    }
}
