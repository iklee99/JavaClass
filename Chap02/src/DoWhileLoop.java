public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        i = 0;
        do {
            System.out.println("printed at least once.");
            i++;
        } while (i < 0);

    }
}
