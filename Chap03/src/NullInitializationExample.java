public class NullInitializationExample {
    public static void main(String[] args) {

        String str; // no initialization

        // "java: variable str might not have been initialized"

        //if (str != null)
        //    System.out.println("Length of str: " + str.length());
        //else
        //    System.out.println("str is null");

        str = null; // initialization

        if (str != null)
            System.out.println("Length of str: " + str.length());
        else
            System.out.println("str is null");

        str = "Hello"; // other case of initialization

        if (str != null)
            System.out.println("Length of str: " + str.length());
        else
            System.out.println("This line will not be reached");
    }
}
