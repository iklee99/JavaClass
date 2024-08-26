import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Please input number: ");
                num = scan.nextInt();
                System.out.println("Input number: " + num);
                break;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("num = " + num);
        scan.close();
    }
}
