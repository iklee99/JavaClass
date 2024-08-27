import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // read an integer
        System.out.println("You entered: " + number);

        System.out.print("Enter a double number: ");
        double dnumber = scanner.nextDouble(); // read a double number
        System.out.println("You entered: " + dnumber);

        System.out.print("Enter a word: ");
        String word = scanner.next();  // read a String up to the first space
        System.out.println("You entered: " + word);

        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine(); // read an entire line of text
        System.out.println("You entered: (" + line + ")");

        System.out.print("Enter a word: ");
        String word2 = scanner.next();  // read a String up to the first space
        System.out.println("You entered: " + word2);

        String dummy = scanner.nextLine(); // read out dummy = "\n";
        System.out.print("Enter a line of text: ");
        String line2 = scanner.nextLine(); // read an entire line of text
        System.out.println("You entered: (" + line2 + ")");

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String dummy2 = scanner.nextLine(); // read out dummy2 = "\n"
        System.out.print("Enter a line of text: ");
        String line3 = scanner.nextLine(); // read an entire line of text
        System.out.println("You entered: (" + num + ") (" + line3 + ")");

    }
}
