public class ThrowingExceptionDemo {
    public static void main(String[] args) {
        String name = "java.lang.String2";
        try {
            Class classObject = findClass(name); // get 'Class' object having 'name'
        } catch (ClassNotFoundException e) {
            System.out.println("No class having name: " + name);
        }
    }
    static Class findClass(String name) throws ClassNotFoundException {
        Class classObject = Class.forName(name);
        return classObject;
    }
}
