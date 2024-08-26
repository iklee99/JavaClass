public class Car2 {
    String model;
    String licensePlate;

    // set method
    void set(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    // equals method
    public boolean equals(Car2 other) {
        return model.equals(other.model) &&
                licensePlate.equals(other.licensePlate); // Compare model and licensePlate
    }

    // toString method
    public String toString() {
        return "Car2{" + "model='" + model + '\'' +
                ", licensePlate='" + licensePlate + '\'' + '}';
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.set("Hyundai Grandure", "ABC123");

        Car2 c2 = new Car2();
        c2.set("Kia Niro", "XYZ789");

        Car2 c3 = new Car2();
        c3.set("Hyundai Grandure", "ABC123");

        // Displaying car details
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2.toString());
        System.out.println("c3: " + c3);
        System.out.println("c1 equals c3: " + c1.equals(c3));
    }
}

