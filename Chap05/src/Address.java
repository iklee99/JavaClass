public class Address {
    private String city;
    private String street;

    // 기본 생성자
    public Address() {
    }

    // 매개변수가 있는 생성자
    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    // Copy Constructor
    public Address(Address address) {
        this.city = address.city;
        this.street = address.street;
    }

    // Getter와 Setter 메서드
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', street='" + street + "'}";
    }
}
