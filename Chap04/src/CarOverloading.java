public class CarOverloading {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3();
        Car3 c3 = new Car3();
        c1.set("Hyundai Grandure", 2024);
        c2.set(2021);
        c3.set("Kia Niro");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
    }
}

class Car3 {
    String model;
    int year;

    // four set methods (overloaded)
    void set(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void set(String model) {
        this.model = model;
        this.year = 0;
    }

    void set(int year) {
        this.model = "NO_MODEL";
        this.year = year;
    }

    void set() {
        this.model = "NO_MODEL";
        this.year = 0;
    }

    // equals method
    public boolean equals(Car3 other) {
        return model.equals(other.model) && (year == other.year);
    }

    // toString method
    public String toString() {
        return "Car3{" + "model='" + model + '\'' + ", year=" + year + '}';
    }
}
