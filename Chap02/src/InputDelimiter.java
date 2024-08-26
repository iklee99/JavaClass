import java.util.Scanner;

public class InputDelimiter {
    public static void main(String[] args) {
        String input = "10 20 30";
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
        String input2 = "10,20,30";
        Scanner scanner2 = new Scanner(input2).useDelimiter(",");
        while (scanner2.hasNextInt()) {
            System.out.println(scanner2.nextInt());
        }
    }
}
