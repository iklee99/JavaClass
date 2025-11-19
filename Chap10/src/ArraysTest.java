import java.util.Arrays; 

public class ArraysTest {
    public static void main(String args[]) {
        double[] values = {1.0, 1.1, 1.2};
        int[][] arr = {{1,2,3,4,5},{5,4,3,2,1}};

        System.out.println(values.toString());               // [D@46a49e6...
        System.out.println(Arrays.toString(values));     // [1.0, 1.1, 1.2]
        System.out.println(Arrays.deepToString(arr));  // [[1,2,3,4,5],[5,4,3,2,1]]

        int[] arr1 = { 1, 2 };
        int[] arr2 = { 1, 2 };
        int[][] arr3 = {{1,2,3,4,5},{5,4,3,2,1}};

        System.out.println(Arrays.equals(arr1, arr2));         // true
        System.out.println(Arrays.deepEquals(arr, arr3));   // true
    }
}
