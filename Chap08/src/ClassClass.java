public class ClassClass {
    public static void main(String[] args) {
        TempClass1 t1 = new TempClass1();
        Class classInfo;
        System.out.println("t1.getClass() returns: " + t1.getClass());
        try {
            classInfo = Class.forName("TempClass1");
            System.out.println("classInfo: " + classInfo);
            System.out.println("classInfo.getName() returns: " + classInfo.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found \"TempClass1\"");
        }
    }
}
class TempClass1 { }
