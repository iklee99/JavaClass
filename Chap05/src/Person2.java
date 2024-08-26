public class Person2 {
    private String name;
    private int age;
    private Address address; // Aggregation: Person2 has an Address

    // class variable
    private static String country = "Unknown";

    // 기본 생성자
    public Person2() {
    }

    // 매개변수가 있는 생성자
    public Person2(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Shallow Copy Constructor
    public Person2(Person2 person) {
        this.name = person.name;
        this.age = person.age;
        this.address = person.address; // Shallow copy
    }

    // Deep Copy Constructor
    public Person2 deepCopy(Person2 person) {
        return new Person2(person.name, person.age, new Address(person.address));
    }

    // Getter와 Setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Person2.country = country;
    }

    // 객체의 문자열 표현을 반환하는 메서드
    @Override
    public String toString() {
        return "Person2{name='" + name + "', age=" + age + ", address=" + address + ", country=" + country + '}';
    }

    public static void main(String[] args) {
        // 원본 객체 생성
        Address address = new Address("Seoul", "1234 Street");
        Person2 original = new Person2("John Doe", 30, address);
        System.out.println("Original: " + original);

        // Shallow Copy Constructor를 사용하여 새로운 객체 생성
        Person2 shallowCopy = new Person2(original);
        System.out.println("Shallow Copy: " + shallowCopy);

        // Deep Copy Constructor를 사용하여 새로운 객체 생성
        Person2 deepCopy = original.deepCopy(original);
        System.out.println("Deep Copy: " + deepCopy);

        // 원본 객체와 복사된 객체의 값이 같은지 확인
        System.out.println("Are the shallow copy objects equal? " + original.equals(shallowCopy));
        System.out.println("Are the deep copy objects equal? " + original.equals(deepCopy));

        // 복사된 객체의 값을 변경하여 원본 객체에 영향을 주지 않는지 확인
        shallowCopy.setName("Jane Doe");
        shallowCopy.setAge(25);
        shallowCopy.getAddress().setCity("Busan");
        shallowCopy.getAddress().setStreet("5678 Avenue");
        System.out.println("Modified Shallow Copy: " + shallowCopy);
        System.out.println("Original after modifying shallow copy: " + original);

        deepCopy.setName("Alice Smith");
        deepCopy.setAge(28);
        deepCopy.getAddress().setCity("Incheon");
        deepCopy.getAddress().setStreet("91011 Boulevard");
        System.out.println("Modified Deep Copy: " + deepCopy);
        System.out.println("Original after modifying deep copy: " + original);

        // 클래스 변수(country) 변경 확인
        Person2.setCountry("Korea");
        System.out.println("Original after changing country: " + original);
        System.out.println("Shallow Copy after changing country: " + shallowCopy);
        System.out.println("Deep Copy after changing country: " + deepCopy);
    }
}

