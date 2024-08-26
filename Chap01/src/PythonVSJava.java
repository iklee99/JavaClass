import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java: Everything should be in a class

public class PythonVSJava {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
}

class ComparisonClass {

    public static void comparison() {

        // Java: Static Typing

        int x = 5;
        //x = "Hello";    // Compile Error
        System.out.println(x);

        // Java: Type Declaration

        String name = "Alice";
        int age = 30;
        System.out.println("name: " + name + " age: " + age);

        // Java: Array and List

        // Array: size fixed.
        String[] fruits = {"apple", "banana", "cherry"};
        // Convert to ArrayList to add more elements
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruits));
        fruitList.add("melon");
        System.out.println(fruitList);

        // Java: Seperate blocks with braces '{}'
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non-positive");
        }

        // Java: For statement uses ': (for each)' or 'initialization; condition; update'

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

    // Java Method Definition

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

}

// Java: Class Definition

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + this.name);
    }
}
