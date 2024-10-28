import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class ExceptionBasedInputLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        String input = null;

        while (!validInput) {
            try {
                System.out.print("Please enter a positive odd integer: ");
                input = scanner.nextLine();
                number = Integer.parseInt(input); // convert String to int
                if (number <= 0) {  // negative integer
                    throw new InvalidInputException("Negative integer");
                }
                else if (number % 2 == 0) { // even number
                    throw new InvalidInputException("Not odd integer");
                }
                validInput = true; // exit from the loop if valid input
            } catch (InvalidInputException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Not a valid integer");
            }
        }

        System.out.println("You entered a valid positive integer: " + number);
        scanner.close();
    }
}
