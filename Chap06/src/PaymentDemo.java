// Abstract class: cannot make an object
abstract class Payment {
    // Abstract method (does not have a body)
    abstract void makePayment(double amount);

    // Regular method
    void transactionDetails() {
        System.out.println("Processing payment...");
    }
}

// Subclass (inherited from Payment)
class CreditCardPayment extends Payment {
    // Providing implementation of abstract method
    void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card.");
    }
}

// Another subclass (inherited from Payment)
class PayPalPayment extends Payment {
    // Providing implementation of abstract method
    void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using PayPal.");
    }
}

// Another subclass (inherited from Payment)
class BankTransferPayment extends Payment {
    // Providing implementation of abstract method
    void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Bank Transfer.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        // Cannot create an instance of the abstract class
        // Payment payment = new Payment(); // This will cause an error

        // Create instances of subclasses
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();
        Payment bankTransferPayment = new BankTransferPayment();

        // Process payments
        creditCardPayment.transactionDetails();
        creditCardPayment.makePayment(100.50);

        payPalPayment.transactionDetails();
        payPalPayment.makePayment(250.75);

        bankTransferPayment.transactionDetails();
        bankTransferPayment.makePayment(400.00);
    }
}


