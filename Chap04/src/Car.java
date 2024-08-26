public class Car {
    // Fields of a Car class
    String model;        // Instance Variable
    String licensePlate; // Instance Variable
    static int totalCars; // Class Variable
    static final String COMPANY_NAME = "SuperCar Rentals"; // Constant

    // Method to display car details
    void displayCarDetails() {
        System.out.println("Model: " + model + ", License Plate: " + licensePlate);
    }

    // Static method to display total cars
    static void displayTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }
}


