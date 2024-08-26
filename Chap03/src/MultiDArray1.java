public class MultiDArray1 {
    public static void main(String[] argv) {
        int[][] a1 = new int[2][3];
        int[][] a2 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};

        for (int i = 0; i < a1.length; i++) // fill the array a1
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = i + j;
            }

        System.out.println("----- a1 -------");

        for (int i = 0; i < a1.length; i++) {  // print the array a1
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----- a2 -------");

        for (int i = 0; i < a2.length; i++) {  // print the array a2
            for (int j = 0; j < a2[i].length; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
