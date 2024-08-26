public class VehicleTest {
    public static void main(String[] args) {
        // Vehicle 객체 생성
        Vehicle vehicle = new Vehicle("Generic Vehicle", 2010);
        System.out.println(vehicle);
        vehicle.startEngine();

        // Car 객체 생성
        Car car = new Car("Toyota", 2020, 4);
        System.out.println(car);
        car.startEngine();

        // Bike 객체 생성
        Bike bike = new Bike("Honda", 2018, true);
        System.out.println(bike);
        bike.startEngine();
    }
}
