class Product {
    String productName;
    double price;
    int quantity;

    // 1. Default constructor
    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // 2. Constructor with product name
    Product(String productName) {
        this.productName = productName;
        price = 0.0;
        quantity = 0;
    }

    // 3. Constructor with name and price
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        quantity = 1;
    }

    // 4. Constructor with all three fields
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total cost
    double calculateTotalCost() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop");

        Product p3 = new Product("Mouse", 500);

        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("CONSTRUCTOR OVERLOADING DEMO");
        System.out.println("============================");

        System.out.println("\n1. Default Constructor");
        p1.display();

        System.out.println("\n2. Name Constructor");
        p2.display();

        System.out.println("\n3. Name and Price Constructor");
        p3.display();

        System.out.println("\n4. All Parameters Constructor");
        p4.display();
    }
}
