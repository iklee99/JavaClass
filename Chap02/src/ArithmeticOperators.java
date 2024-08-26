public class ArithmeticOperators {
    public static void main (String[] args) {
        int a = 11, b = 5;
        int sum = a + b;       // 16
        int difference = a - b; // 6
        int product = a * b;    // 55
        int quotient = a / b;   // 2
        int remainder = a % b;  // 1
        int c = a++; // 11
        int d = ++a; // 13
        int e = b--; // 5
        int f = --b; // 3
        System.out.println("sum = " + sum + "\n"+
                "difference = " + difference + "\n" +
                "product = " + product + "\n" +
                "quotient = " + quotient + "\n" +
                "remainder = " + remainder + "\n" +
                "c = " + c + "\n" +
                "d = " + d + "\n" +
                "e = " + e + "\n" +
                "f = " + f);
    }
}
