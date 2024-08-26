class Parent {
    protected String name = "Parent Name";
    protected void display() {
        System.out.println("This is a protected method in Parent class.");
    }
}

class Child extends Parent {
    public void showName() {
        // can directly access parent's protected instance variables and protected methods
        System.out.println("Name: " + name);
        display();
    }
}

public class ProtectedExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.showName();
    }
}
