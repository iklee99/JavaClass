public class TryCatchDemo {
    public static void main(String[] args) {
        String[] str = new String[]{"123", "45", "abc"};
        int[] a = new int[3];
        for (int i = 0; i < 4; i++) {
            try {
                a[i] = Integer.parseInt(str[i]);
                System.out.println("Index " + i + " parseInt done");
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index exception at index " + i);
            } catch(NumberFormatException e) {
                System.out.println("Number format exception at index " + i);
            } catch(Exception e) {
                System.out.println("Other exception at index " + i);
            } finally {
                System.out.println("finally index " + i + " done");
            }
        }
    }
}
