public class MultiDArray1 {
    public static void main(String[] argv) {
        int[][] array1 = new int[2][3];
        int[][] array2 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};

        for (int i = 0; i < array1.length; i++) // fill the array a1
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = i + j;
            }

        System.out.println("----- array1 -------");

        for (int i = 0; i < array1.length; i++) {  // print the array a1
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----- array2 -------");

        for (int i = 0; i < array2.length; i++) {  // print the array a2
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
