import java.util.Random;

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for " + name);
        }
    }
}

public class BankService {
    private static final int TOTAL_CUSTOMERS = 3;
    private static final Random random = new Random(12345); // Fixed seed

    public static void provideService(Customer customer) {
        int serviceType = random.nextInt(2);
        double amount = 100 + random.nextDouble() * 900; // Random amount between 100 and 1000
        amount = Math.round(amount * 100.0) / 100.0; // Round to 2 decimal places

        System.out.printf("Serving %s (Current balance: $%.2f): ", customer.getName(), customer.getBalance());

        if (serviceType == 0) {
            customer.deposit(amount);
            System.out.printf("Deposited $%.2f\n", amount);
        } else {
            customer.withdraw(amount);
            System.out.printf("Attempted to withdraw $%.2f\n", amount);
        }

        System.out.printf("New balance for %s: $%.2f\n", customer.getName(), customer.getBalance());
    }

    public static void main(String[] args) {
        Customer[] customers = new Customer[TOTAL_CUSTOMERS];
        customers[0] = new Customer("Alice", 1000);
        customers[1] = new Customer("Bob", 1500);
        customers[2] = new Customer("Charlie", 2000);

        for (int i = 0; i < 15; i++) {
            int turn = random.nextInt(TOTAL_CUSTOMERS);
            System.out.println("\nRound " + (i + 1) + ":");
            provideService(customers[turn]);
        }
    }
}
