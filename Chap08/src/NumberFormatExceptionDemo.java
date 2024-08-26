public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String str1 = "132.68";
        String str2 = "abcde";
        int num1 = Integer.parseInt(str1);
        double num2 = Double.parseDouble(str2);
    }
}
