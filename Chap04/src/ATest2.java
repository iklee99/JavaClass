public class ATest2 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        double result = myMethod(a, b, c);
        System.out.println("OUTPUT: " + result);
    }

    /*--------------------------------------------------------
    In a class that contains a main method, any other methods
    called from main must be static.
    In general, the only methods that can be called
    from a static method are static methods.
    ----------------------------------------------------------*/
    static double myMethod(int a, int b, double c) {
        return a + b + c;
    }

}
