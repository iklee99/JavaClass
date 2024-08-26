public class AnimalTest {
    public static void main(String[] args) {
        // Animal object
        Animal animal = new Animal("Generic Animal", 5);
        System.out.println(animal);
        animal.makeSound();

        // Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println(dog);
        dog.makeSound();

        // Cat object
        Cat cat = new Cat("Whiskers", 2, "Black");
        System.out.println(cat);
        cat.makeSound();
    }
}
