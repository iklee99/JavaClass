public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        i = 0;
        while (true) {  // infinite loop
            if (i >= 5) {  // using break statment to exit from the loop
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
