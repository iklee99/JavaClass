public class AClass {
    public class BClass {
        public class CClass {  }
    }

    public static void main(String[] args) {
        AClass aObject = new AClass();
        AClass.BClass bObject = aObject.new BClass();
        AClass.BClass.CClass cObject = bObject.new CClass();
    }
}



