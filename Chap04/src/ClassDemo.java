public class ClassDemo {
    public static void main(String[] args) {

        // c1, c2: objects of class SampleClass
        SampleClass c1 = new SampleClass();
        SampleClass c2 = new SampleClass();

        // same member variable x, but different values
        c1.x = 2;
        c2.x = c1.x + 1;
        c1.sayHello(5); // Hello 2 5
        c2.sayHello(7); // Hello 3 7
    }
}
