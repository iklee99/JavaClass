public class AAATest {
    int k;  // instance variable
    public static void main(String[] args) {
        Class3 p = new Class3(); // p: local variable
        Class4 q = new Class4(); // q: local variable
        p.a = 3;
        q.a = 5;
        System.out.println(p.add(1) + " " + q.sub(1));
    }
}

class Class3 {
    int a; // instance variable
    int add(int b) {
        int c = 3;  // c: local variable
        return a + b + c;  //b: local variable
    }
}

class Class4 {
    int a; // instance variable
    int sub(int b) {
        return a - b; //b: local variable
    }
}
