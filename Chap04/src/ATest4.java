public class ATest4 {
    public static void main(String[] args) {
        int x, y;
        FooClass f = new FooClass();
        System.out.println(f.a + " " + f.b + " " + f.c);
        //System.out.println(x + " " + y); // ERROR! x, y not initialized
    }
}

class FooClass {
    int a;
    boolean b;
    double c;
}
