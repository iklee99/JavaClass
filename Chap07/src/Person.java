public class Person implements Ordered {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean precedes(Object other) {
        if (other instanceof Person) {
            Person otherPerson = (Person) other;
            return this.age < otherPerson.age;
        }
        return false;
    }

    @Override
    public boolean follows(Object other) {
        if (other instanceof Person) {
            Person otherPerson = (Person) other;
            return this.age > otherPerson.age;
        }
        return false;
    }
}
