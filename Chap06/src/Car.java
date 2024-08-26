public class Car extends Vehicle {
    private int doors;

    // 기본 생성자
    public Car() {
        super();
    }

    // 매개변수가 있는 생성자
    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    // Getter와 Setter 메서드
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // 메서드 오버라이딩
    @Override
    public void startEngine() {
        super.startEngine(); // 부모 클래스의 메서드 호출
        System.out.println("The car engine is starting...");
    }

    @Override
    public String toString() {
        return "Car{brand='" + getBrand() + "', year=" + getYear() + ", doors=" + doors + '}';
    }
}
