import java.util.Random;

class Operator {

    private int myTurn;
    public Operator(int myTurn) { // constructor
        this.myTurn = myTurn;
    }

    public double perform(double a, double b) {
        double answer = 0.0;
        switch (myTurn) {
            case 0: /* addition */
                answer = a + b;
                System.out.printf("(%8.3f) + (%8.3f) = %11.3f, ", a, b, answer);
                break;
            case 1: /* subtraction */
                answer = a - b;
                System.out.printf("(%8.3f) - (%8.3f) = %11.3f, ", a, b, answer);
                break;
            case 2: /* multiplication */
                answer = a * b;
                System.out.printf("(%8.3f) * (%8.3f) = %11.3f, ", a, b, answer);
                break;
            default:
                System.out.println("Wrong operator: " + myTurn);
                System.exit(0);
        }
        return answer;
    }
}

public class OperationSequencer {
    // Random object to determine the next turn
    private static final Random random = new Random();
    private static final int TOTAL_OPERATIONS = 3;
    private static int turn = 0;

    public static void main(String[] args) {

        // Setting random seed
        random.setSeed(10483);

        // creating three operator objects
        Operator[] op = new Operator[3];
        for (int i = 0; i < 3; i++)
            op[i] = new Operator(i);

        double sum = 0.0;
        double rangeMin = -1000.0;
        double rangeMax = 1000.0;

        for (int i = 0; i < 15; i++) {  // Loop to demonstrate multiple sequences
            turn = random.nextInt(TOTAL_OPERATIONS);
            double a = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
            double b = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
            System.out.printf("%2d) turn = %d  ", i, turn);
            for (int j = 0; j < 3; j++) {
                if (turn == j) sum = sum + op[j].perform(a, b);
            }
            System.out.println("sum = " + sum);
        }
    }
}
