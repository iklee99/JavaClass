
public class AnonymousClassDemo {
    public static void main(String[] argc) {
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
        computer1.compute(); // OUTPUT: “This is the computer1”
        computer2.compute(); // OUTPUT: “This is the computer2”
    }
}
