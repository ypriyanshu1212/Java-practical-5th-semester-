class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: Rs. " + amount);
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("\nAccount Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Current Balance: Rs. " + getBalance());
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            "Priyanshu", "1234567890", 5000
        );

        System.out.println("Initial Account Details:");
        account.displayDetails();

        System.out.println("\nValid Transactions:");
        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("\nInvalid Transactions:");
        account.deposit(-500);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("\nFinal Account Details:");
        account.displayDetails();
    }
}
