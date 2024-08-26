import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int score;
        char grade;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your score? ");
        score = keyboard.nextInt();
        int scoreOverTen = score / 10;

        switch (scoreOverTen) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            default:
                grade = 'C';
        }

        System.out.println("Score: " + score + " Grade: " + grade + "\n");

        System.out.print("Choose your menu (Americano, CafeLatte, Cappuccino): ");
        String menu = keyboard.next();
        int sales = 0;

        switch (menu) {
            case "Americano":
                sales += 3500;
                break;
            case "CafeLatte":
                sales += 4500;
                break;
            case "Cappuccino":
                sales += 4800;
                break;
            default:
                System.out.println("Wrong coffee menu.. system exit...");
                System .exit(0);
        }

        System.out.println("Sales: " + sales);
    }
}
