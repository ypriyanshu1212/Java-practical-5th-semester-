class Product {
    String productName;
    double price;
    int quantity;

    // No-argument constructor
    Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor with product name
    Product(String productName) {
        this.productName = productName;
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor with product name and price
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 1;
    }

    // Constructor with all three fields
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
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500.0);
        Product p4 = new Product("Keyboard", 1200.0, 2);

        System.out.println("Product 1 - No Arguments:");
        p1.display();

        System.out.println("Product 2 - Name Only:");
        p2.display();

        System.out.println("Product 3 - Name and Price:");
        p3.display();

        System.out.println("Product 4 - All Arguments:");
        p4.display();
    }
}

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
       
