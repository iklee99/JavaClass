// Person.java
public class Person {
    private String name;
    private int age;

    // default constructor
    public Person() { }

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Accessors and Mutators
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

    // toString
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {

        Person original = new Person("John Doe", 30);
        System.out.println("Original: " + original);

        // Using copy constructor
        Person copy = new Person(original);
        System.out.println("Copy: " + copy);

        // Test the equality between original and copy objects
        System.out.println("Are the objects equal? " + original.equals(copy));

        // Test the privacy leak
        copy.setName("Jane Doe");
        copy.setAge(25);
        System.out.println("Modified Copy: " + copy);
        System.out.println("Original after modifying copy: " + original);
    }
}

