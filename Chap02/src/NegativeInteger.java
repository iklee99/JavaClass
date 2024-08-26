public class NegativeInteger {
    public static void main(String[] args) {
        int bits = 8;
        int a = 5;
        String binaryString = Integer.toBinaryString(a);
        String formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a =  " + a + "     (" + formattedBinaryString + ")");
        a = ~a;
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a = ~a    " + " (" + formattedBinaryString + ")");

        a = a + 1;
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a = ~a + 1" + " (" + formattedBinaryString + ")");

        a = -5;
        binaryString = Integer.toBinaryString(a);
        formattedBinaryString = String.format("%" + bits + "s", binaryString)
                .replace(' ', '0')
                .substring(Math.max(0, binaryString.length() - bits));
        System.out.println("a = " + a + "     (" + formattedBinaryString + ")");

    }
}
