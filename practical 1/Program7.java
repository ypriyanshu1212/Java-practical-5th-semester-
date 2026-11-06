class Demo {

    Demo() {
        System.out.println("Object created");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collection performed");
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1 = null;
        obj2 = null;

        System.out.println("Objects are no longer referenced.");

        System.gc();

        System.out.println("Main method completed.");
    }
}
