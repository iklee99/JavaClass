public class Person {
    // Private instance variables
    private String name;
    private int age;
    String address;

    // Default constructor
    public Person() {
        this("Unknown", 0); // Call another constructor
        System.out.println("Default constructor called.");
    }

    // Constructor with name only
    public Person(String name) {
        this(name, 0); // Call another constructor
        System.out.println("Constructor with name called.");
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with name and age called.");
    }

    // Public accessor for name
    public String getName() {
        return name;
    }

    // Public mutator for name
    public void setName(String name) {
        this.name = name;
    }

    // Public accessor for age
    public int getAge() {
        return age;
    }

    // Public mutator for age
    public void setAge(int age) {
        this.age = age;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.toString());

        Person person2 = new Person("Alice");
        System.out.println(person2.toString());

        Person person3 = new Person("Bob", 30);
        System.out.println(person3.toString());

        // Using accessors and mutators
        person1.setName("Charlie");
        person1.setAge(25);
        System.out.println(person1.toString());
    }
}

