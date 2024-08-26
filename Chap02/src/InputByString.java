import java.util.Scanner;

public class InputByString {
    public static void main(String[] args) {
        String input = "Korea 123.456 5678";
        Scanner scanner = new Scanner(input);
        String str = scanner.next();
        float fnum = scanner.nextFloat();
        int inum = scanner.nextInt();
        System.out.println(str + " " + fnum + " " + inum);
    }
}
