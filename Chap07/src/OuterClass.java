public class OuterClass {

    static class SNClass { // Static nested class
        void display() {
            System.out.println("Inside static nested class");
        }
    }

    class InnerClass { // Inner class (member inner class)
        void display() {
            System.out.println("Inside inner class");
        }
    }

    void myMethod() {
        class LIClass { // Local Inner Class
            void display() {
                System.out.println("Inside local inner class");
            }
        }
        LIClass liObject = new LIClass(); // should be used within the method
        liObject.display();
    }
}
