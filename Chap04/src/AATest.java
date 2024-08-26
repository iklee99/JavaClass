public class AATest {
    public static void main(String[] args) {
        Class1 p = new Class1();
        Class2 q = new Class2();
        p.a = 3;
        q.a = 5;
        System.out.println(p.add(1) + " " + q.sub(1));
    }
}
