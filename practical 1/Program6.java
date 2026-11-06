class Book {
    String title;
    String author;
    double price;

    // No-argument constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Using no-argument constructor
        Book b1 = new Book();

        // Using parameterized constructor
        Book b2 = new Book("Java Programming",
                           "James Gosling", 550.0);

        // Using copy constructor
        Book b3 = new Book(b2);

        System.out.println("Book 1:");
        b1.display();

        System.out.println("Book 2:");
        b2.display();

        System.out.println("Book 3 (Copied):");
        b3.display();

        // Modifying copied object
        b3.title = "Advanced Java";
        b3.price = 700.0;

        System.out.println("After modifying copied object:");

        System.out.println("Original Book:");
        b2.display();

        System.out.println("Modified Copied Book:");
        b3.display();
    }
}
