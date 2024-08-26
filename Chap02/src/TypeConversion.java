public class TypeConversion {
    public static void main(String[] args) {

        int myInt = 10;
        double myDouble = myInt;    // Implicit conversion from int to double
                                    // range of (double) > range of (int)
        System.out.println("myInt(" + myInt + ") myDouble(" + myDouble + ")");

        myDouble = 9.78;
        myInt = (int) myDouble;     // Explicit conversion from double to int
                                    // range of (int) < range of (double)

        System.out.println("myInt(" + myInt + ") myDouble(" + myDouble + ")");


    }
}
