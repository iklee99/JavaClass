public class TryCatchDemo {
    public static void main(String[] args) {
        String[] str = new String[]{"123", "45", "abc"};
        int[] a = new int[3];
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print("a[" + i + "] = ");
                a[i] = Integer.parseInt(str[i]);
                System.out.print(a[i]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.print("Array index exception");
            } catch(NumberFormatException e) {
                System.out.print("Number format exception");
            } catch(Exception e) {
                System.out.print("Other exception");
            } finally {
                System.out.println(" done");
            }
        }
    }
}
