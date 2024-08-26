interface Inter1 {
    int NUMBER = 25;
}

interface Inter2 {
    int NUMBER = 32;
}

public class InconsistentInterfaceDemo implements Inter1, Inter2 {
    public static void main(String[] argc) {
        //int x = NUMBER;  // Compile error
    }
}
