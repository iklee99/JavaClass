import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Input an integer: ");
                number = scanner.nextInt();  // 정수 입력 시도
                validInput = true;  // 올바른 입력이 들어오면 반복 종료
            } catch (InputMismatchException e) {
                System.out.print("Wrong input. Try again: ");
                scanner.next();  // 잘못된 입력을 버리고 다시 시도
            }
        }

        System.out.println("Input Integer: " + number);
        scanner.close();
    }
}
