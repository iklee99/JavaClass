public class ForLoop {
    public static void main(String[] args) {
        // basic for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // nested for loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        // for-each
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
