public class BitwiseOperators {
    public static void main(String[] args) {
        int bits = 8;
        int a = 5, b = -3;
        System.out.println("a = " + a + "        (" + binaryString(a, bits) + ")");
        System.out.println("b = " + b + "       (" + binaryString(b, bits) + ")");

        int andResult = a & b; // a & b = 5    (00000101)
        System.out.println("a & b = " + andResult + "    (" + binaryString(andResult, bits) + ")");

        int orResult = a | b;  // a | b = -3   (11111101)
        System.out.println("a | b = " + orResult + "   (" + binaryString(orResult, bits) + ")");

        int xorResult = a ^ b; // a ^ b = -8   (11111000)
        System.out.println("a ^ b = " + xorResult + "   (" + binaryString(xorResult, bits) + ")");

        int notResult = ~a;    // ~a = -6      (11111010)
        System.out.println("~a = " + notResult + "      (" + binaryString(notResult, bits) + ")");

        int leftShift = a << 1;  // a << 1 = 10  (00001010)
        System.out.println("a << 1 = " + leftShift + "  (" + binaryString(leftShift, bits) + ")");

        int leftShiftB = b << 1;  // b << 1 = -6  (11111010)
        System.out.println("b << 1 = " + leftShiftB + "  (" + binaryString(leftShiftB, bits) + ")");

        int rightShift = a >> 1; // a >> 1 = 2   (00000010)
        System.out.println("a >> 1 = " + rightShift + "   (" + binaryString(rightShift, bits) + ")");

        int rightShiftB = b >> 1; // b >> 1 = -2  (11111110)
        System.out.println("b >> 1 = " + rightShiftB + "  (" + binaryString(rightShiftB, bits) + ")");

        int right2Shift = a >> 2; // a >> 2 = 1   (00000001)
        System.out.println("a >> 2 = " + right2Shift + "   (" + binaryString(right2Shift, bits) + ")");

        int right2ShiftB = b >> 2; // b >> 2 = -1  (11111111)
        System.out.println("b >> 2 = " + right2ShiftB + "  (" + binaryString(right2ShiftB, bits) + ")");
    }

    static String binaryString(int a, int bits) {
        String binaryString = Integer.toBinaryString(a);
        String formattedBinaryString;
        if (a >= 0) {
            formattedBinaryString = String.format("%" + bits + "s", binaryString)
                    .replace(' ', '0');
        }
        else {
            formattedBinaryString = String.format("%" + bits + "s", binaryString)
                    .replace(' ', '0')
                    .substring(Math.max(0, binaryString.length() - bits));
        }
        return formattedBinaryString;
    }
}
