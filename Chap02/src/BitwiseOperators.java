public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int andResult = a & b; // 1
        int orResult = a | b;  // 7
        int xorResult = a ^ b; // 6
        int notResult = ~a;    // -6

        int leftShift = a << 1;  // 10
        int rightShift = a >> 1; // 2
        int unsignedRightShift = a >>> 1; // 2
    }
}
