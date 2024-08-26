public class Bike extends Vehicle {
    private boolean hasCarrier;

    // 기본 생성자
    public Bike() {
        super();
    }

    // 매개변수가 있는 생성자
    public Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }

    // Getter와 Setter 메서드
    public boolean hasCarrier() {
        return hasCarrier;
    }

    public void setCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    // 메서드 오버라이딩
    @Override
    public void startEngine() {
        super.startEngine(); // 부모 클래스의 메서드 호출
        System.out.println("The bike engine is starting...");
    }

    @Override
    public String toString() {
        return "Bike{brand='" + getBrand() + "', year=" + getYear() + ", hasCarrier=" + hasCarrier + '}';
    }
}
