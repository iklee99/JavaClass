public class OuterClassDemo {
    public static void main(String[] args) {
        // directly create OuterClass.SNClass
        OuterClass.SNClass snObject = new OuterClass.SNClass();
        snObject.display();

        OuterClass outObject = new OuterClass(); // create outer object first
        // using outObject.new to create innerClass's object
        OuterClass.InnerClass inObject = outObject.new InnerClass();
        inObject.display();
        outObject.myMethod();

        Computer computer1 = new Computer() { // anonymous class
            public void compute() {
                System.out.println("This is the computer1");
            }
        };

        Computer computer2 = new Computer() {
            public void compute() {
                System.out.println("This is the computer2");
            }
        };

        computer1.compute();
        computer2.compute();
    }
}
