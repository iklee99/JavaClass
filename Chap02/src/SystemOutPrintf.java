public class SystemOutPrintf {
    public static void main(String[] args) {
        System.out.printf("Formatted number: %d\n", 123);
        System.out.printf("Width 10: %10d\n", 123); // field width (right justified)
        System.out.printf("Two decimal places: %.2f\n", 123.456);
        System.out.printf("Left justified: %-10d|\n", 123);
        System.out.printf("%-10s %10s %10s\n", "Name", "Age", "Score");
        System.out.printf("%-10s %10d %10.2f\n", "Alice", 30, 88.5);
        System.out.printf("%-10s %10d %10.2f\n", "Bob", 25, 91.75);
        System.out.printf("Price: $%.2f\n", 19.99);
    }
}
