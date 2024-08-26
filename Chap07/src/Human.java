import java.util.Comparator;

class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Human h1 = (Human) o1;
        Human h2 = (Human) o2;
        return Integer.compare(h1.getAge(), h2.getAge());
    }
}

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Human human1 = new Human("Alice", 30);
        Human human2 = new Human("Bob", 25);

        AgeComparator comparator = new AgeComparator();

        int comparisonResult = comparator.compare(human1, human2);

        if (comparisonResult < 0) {
            System.out.println(human1.getName() + " is younger than " + human2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(human1.getName() + " is older than " + human2.getName());
        } else {
            System.out.println(human1.getName() + " and " + human2.getName() + " are the same age");
        }
    }
}




