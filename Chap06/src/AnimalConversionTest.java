public class AnimalConversionTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Jane", 8, "bulldog");
        Cat cat = new Cat("Kitti", 5, "white");
        Animal animal = new Animal("Tom", 3);
        animal.makeSound();  // original Animal's makeSound()
        animal = dog;
        animal.makeSound();  // dog's overridden makeSound()
        animal = cat;
        animal.makeSound();  // cat's overridden makeSound()
    }
}
