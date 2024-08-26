public class AClass {
    public int x;
    private int y;
    int z;

    public AClass() {
        x = 2;
        y = 3;
        z = 4;
    }

    public void publicMethod() {
        System.out.println("AClass:publicMethod " + (x + y + z));
    }
    private void privateMethod() {
        System.out.println("AClass:privateMethod");
    }
    void packageMethod() {
        System.out.println("AClass:packageMethod");
        publicMethod();
        privateMethod();
    }
}
