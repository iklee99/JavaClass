public class PersonOrderDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        System.out.println("Person1 precedes Person2: " + person1.precedes(person2)); // true
        System.out.println("Person1 follows Person2: " + person1.follows(person2));   // false
        System.out.println("Person2 precedes Person1: " + person2.precedes(person1)); // false
        System.out.println("Person2 follows Person1: " + person2.follows(person1));   // true
    }
}
