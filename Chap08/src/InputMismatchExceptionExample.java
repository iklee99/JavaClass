import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        System.out.println("Input Integer: " + number);
        scanner.close();
    }
}
