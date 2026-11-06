    Demo() {
        System.out.println("Object is created.");
    }

    void display() {
        System.out.println("Object is being used.");
    }

    // Cleanup reference exercise
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called finalize().");
        super.finalize();
    }

    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();

        // Remove reachable reference
        obj = null;

        System.out.println("Object reference removed.");

        // Request garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");

        // Program continues without depending on cleanup timing
    }
}
