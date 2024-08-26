class AClass {
    private int x;
    public AClass(int x) { this.x = x; }
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof AClass) {
            AClass other = (AClass) obj;
            if (x == other.x) return true;
            return false;
        }
        return false;
    }
}
class BClass extends AClass {
    private int y;
    public BClass(int x, int y) { super(x); this.y = y; }
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof BClass) {
            BClass other = (BClass) obj;
            if (super.equals(obj) && y == other.y) return true;
            return false;
        }
        return false;
    }
}
class CClass {
    private String name;
    public CClass(String name) { this.name = name; }
}

public class EqualWithPolymorphism {
    public static void main(String[] args) {
        AClass a1 = new AClass(3);
        AClass a2 = new AClass(7);
        BClass b1 = new BClass(3, 5);
        BClass b2 = new BClass(7, 9);
        CClass c = new CClass("Korea");
        System.out.println(a1.equals(a1));
        System.out.println(a1.equals(b1));
        System.out.println(a1.equals(b2));
        System.out.println(a2.equals(c));
    }
}
