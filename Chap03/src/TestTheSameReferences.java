public class TestTheSameReferences {
    public static void main(String[] args) {
        String a = new String("test");
        String b = new String("test");
        String c = "test";
        String d = "test";
        String e = a;
        System.out.println("a == b ? " + (a == b)); // false
        System.out.println("a == c ? " + (a == c)); // false
        System.out.println("a == d ? " + (a == d)); // false
        System.out.println("a == e ? " + (a == e)); // true
        System.out.println("b == c ? " + (b == c)); // false
        System.out.println("b == d ? " + (b == d)); // false
        System.out.println("b == e ? " + (b == e)); // false
        System.out.println("c == d ? " + (c == d)); // true
        System.out.println("c == e ? " + (c == e)); // false
    }
}
