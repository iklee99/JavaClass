public class ATest {
    public static void main(String[] args) {
        int a = 5;
        for (int k = 0; k < 5; k++) {
            //int a = k + 1;  // Compile Error! a already declared
            System.out.println(k);
        }
        //System.out.println(k);  // Compile Error! no k in main
    }
}
