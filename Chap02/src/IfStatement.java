public class IfStatement {
    public static void main(String[] args) {
        int num = 10;
        // single if
        if (num > 5) {
            System.out.println("Number is greater than 5");
        }
        // if-else
        num = 2;
        if (num > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is not greater than 5");
        }
        // if-else if-else
        num = 10;
        if (num > 10) {
            System.out.println("Number is greater than 10");
        } else if (num == 10) {
            System.out.println("Number is equal to 10");
        } else {
            System.out.println("Number is less than 10");
        }
        // nested if
        num = 10;
        if (num > 5) {
            if (num < 15) {
                System.out.println("Number is between 5 and 15");
            }
        }
    }
}
