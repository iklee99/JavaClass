public class CarRentalSystem {
    public static void main(String[] args) {
        // Creating Car objects
        Car car1 = new Car();
        car1.model = "Toyota Camry";
        car1.licensePlate = "ABC123";
        Car.totalCars++;

        Car car2 = new Car();
        car2.model = "Honda Accord";
        car2.licensePlate = "XYZ789";
        Car.totalCars++;

        // Displaying car details
        car1.displayCarDetails();
        car2.displayCarDetails();

        // Displaying total number of cars
        Car.displayTotalCars();

        // Creating Customer objects
        Customer customer1 = new Customer();
        customer1.name = "John Doe";
        customer1.customerID = 101;

        Customer customer2 = new Customer();
        customer2.name = "Jane Smith";
        customer2.customerID = 102;

        // Displaying customer details
        customer1.displayCustomerDetails();
        customer2.displayCustomerDetails();

        // Customers renting cars
        customer1.rentCar(car1);
        customer2.rentCar(car2);

        // Display company name
        System.out.println("Company: " + Car.COMPANY_NAME);
    }
}

