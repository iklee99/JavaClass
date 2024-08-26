public class Customer {
    // Fields of a Customer class
    String name;         // Instance Variable
    int customerID;      // Instance Variable

    // Method to display customer details
    void displayCustomerDetails() {
        System.out.println("Customer Name: " + name + ", Customer ID: " + customerID);
    }

    // Method to rent a car
    void rentCar(Car car) {
        System.out.println(name + " rented a car: " + car.model + " with license plate: " + car.licensePlate);
    }
}


