import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // read an integer
        System.out.println("You entered: " + number);

        System.out.print("Enter a floating-point number: ");
        double dnumber = scanner.nextDouble(); // read a double number
        System.out.println("You entered: " + dnumber);

        System.out.print("Enter a word: ");
        String word = scanner.next();  // read a String up to the first space
        System.out.println("You entered: " + word);

        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine(); // read an entire line of text
        System.out.println("You entered: (" + line + ")");

        System.out.print("Enter an integer and a line of text: ");
        int num = scanner.nextInt();
        String line2 = scanner.nextLine(); // read an entire line of text
        System.out.println("You entered: (" + num + ") (" + line2 + ")");

        System.out.print("Enter an integer and a line of text: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        String line3 = scanner.nextLine(); // read an entire line of text
        System.out.println("You entered: (" + num2 + ") (" + line3 + ")");
    }
}
