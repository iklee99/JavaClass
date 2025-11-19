import java.util.Arrays;

public class ArraysTest2 {
    public static void main(String args[]) {
        int[] arr = {0,1,2,3,4};
        int[] arr2 = Arrays.copyOf(arr, arr.length);   	// [0,1,2,3,4]
        int[] arr3 = Arrays.copyOf(arr, 3);    // [0,1,2]
        int[] arr4 = Arrays.copyOf(arr, 7);     // [0,1,2,3,4,0,0]
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);   	// [2,3]
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);   	// [0,1,2,3,4,0,0]

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);      				// [9,9,9,9,9]
        // setAll method는 Java version 8부터 추가가 되어서 여기에서는 comment out해 놓았음
        //Arrays.setAll(arr7, () -> (int) (Math.random() * 5) + 1); 	// [1,5,2,1,1]
    }
}
