public class ThisInConstructor {
    private String name;
    private int age;

    public ThisInConstructor() {    // Default constructor
        this("Unknown", 0); // Call another constructor
    }

    public ThisInConstructor(String name) {    // Constructor with name only
        this(name, 0); // Call another constructor
    }

    public ThisInConstructor(String name, int age) {    // Constructor with name and age
        this.name = name;  // This 'this' is not for calling other constructor
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        ThisInConstructor person1 = new ThisInConstructor();
        System.out.println("Person1: " + person1);

        ThisInConstructor person2 = new ThisInConstructor("Alice");
        System.out.println("Person2: " + person2);

        ThisInConstructor person3 = new ThisInConstructor("Bob", 30);
        System.out.println("Person3: " + person3);
    }
}
