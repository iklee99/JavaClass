public class AClassTest {
    public static void main(String[] args) {
        AClass ac = new AClass();
        System.out.println("ac.x = " + ac.x);
        //System.out.println("ac.y = " + ac.y); // compile error!
        System.out.println("ac.z = " + ac.z);
        ac.publicMethod();
        //ac.privateMethod();  // compile error!
        ac.packageMethod();
    }
}
