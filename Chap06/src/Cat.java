public class Cat extends Animal {
    private String color;

    // default constructor
    public Cat() {
        super();
    }

    // constructor with parameters
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Accessors and Mutators
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    // toString method
    @Override
    public String toString() {
        return "Cat{name='" + getName() + "', age=" + getAge() + ", color='" + color + "'}";
    }
}
