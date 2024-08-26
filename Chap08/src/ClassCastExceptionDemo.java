class Vehicle { };
class Auto extends Vehicle { };
class Bicycle extends Vehicle { };

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Vehicle vec1 = new Auto();
        Vehicle vec2 = new Bicycle();

        Auto auto1 = (Auto) vec1;    // OK
        if (vec1 instanceof Auto) {  // preventing wrong conversion
            Auto auto2 = (Auto) vec1;
        }

        Bicycle by = (Bicycle) vec2; // OK
        Auto auto3 = (Auto) vec2;    // ClassCastException
                                     // vec2 is originally Bicycle, not Auto
    }
}
