public class VerticalNumbersIteration {
    public static void main(String[] args) {
        System.out.println("writeVertical(3):");
        writeVertical(3);
        System.out.println("writeVertical(12):");
        writeVertical(12);
        System.out.println("writeVertical(123):");
        writeVertical(123);
    }
    public static void writeVertical(int n) {
        int nsTens = 1;
        int leftEndPiece = n;
        while (leftEndPiece > 9) {
            leftEndPiece = leftEndPiece / 10;
            nsTens = nsTens * 10;
        }
        // nsTens is a power of 10 that has the same number of digits as n.
        // ex) if n = 2345, then nsTen is 1000.
        for (int powerOf10 = nsTens; powerOf10 > 0; powerOf10 = powerOf10/10) {
            System.out.println(n/powerOf10);
            n = n % powerOf10;
        }
    }
}
