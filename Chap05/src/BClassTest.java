public class BClassTest {
    public static void main(String[] args) {
        BClass b = new BClass(3, "Korea");
        System.out.println("b.x=" + b.getX() + "  b.str=" + b.getStr());
        b.setX(5);
        b.setStr("Seoul");
        System.out.println("b.x=" + b.getX() + "  b.str=" + b.getStr());
    }
}

