public class Animal {
    private String name;
    private int age;

    // Default constructor
    public Animal() {
    }

    // Constructor with parameters
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    // Method makesound()
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + '}';
    }
}
