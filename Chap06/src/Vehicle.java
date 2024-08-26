// Vehicle.java
public class Vehicle {
    private String brand;
    private int year;

    // 기본 생성자
    public Vehicle() {
    }

    // 매개변수가 있는 생성자
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter와 Setter 메서드
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // 일반 메서드
    public void startEngine() {
        System.out.println("The engine is starting...");
    }

    @Override
    public String toString() {
        return "Vehicle{brand='" + brand + "', year=" + year + '}';
    }
}
