public class Dog extends Animal {
    private String breed;

    // Default constructor
    public Dog() {
        super();
    }

    // Constructor with parameters
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Accessors and Mutators
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', age=" + getAge() + ", breed='" + breed + "'}";
    }
}
