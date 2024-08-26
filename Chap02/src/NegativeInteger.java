public class NegativeInteger {
    public static void main(String[] args) {
        int bits = 8;
        int a = 5;  // a =  5     (00000101)
        String binaryString = Integer.toBinaryString(a);
        String formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0');
        System.out.println("a =  " + a + "     (" + formattedBinaryString + ")");

        a = ~a;   // a = ~a     (11111010) 1's complement of a
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a = ~a    " + " (" + formattedBinaryString + ")");

        a += 1; // a = ~a + 1 (11111011) 1's complement + 1 = 2's complement
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a = ~a + 1" + " (" + formattedBinaryString + ")");

        a = -5;   // a = -5 (11111011)   2's complement 5 = -5
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a = " + a + "     (" + formattedBinaryString + ")");

        a -= 1;  // a = -5 -1
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a = (~a + 1) - 1 = ~a " +  "(" + formattedBinaryString + ")");

        a = ~a;
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0');
        System.out.println("a = ~(~a) = " + a + "         (" + formattedBinaryString + ")");

    }
}
