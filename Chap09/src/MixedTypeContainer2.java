public class MixedTypeContainer2<T extends Number, U extends Runnable> {
    private T number;
    private U runnableItem;

    public MixedTypeContainer2(T number, U runnableItem) {
        this.number = number;
        this.runnableItem = runnableItem;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public U getRunnableItem() {
        return runnableItem;
    }

    public void setRunnableItem(U runnableItem) {
        this.runnableItem = runnableItem;
    }

    // Generic method having two bounded type parameters V and W
    public <V extends Number, W extends CharSequence> void executeAndPrint(V otherNumber, W charSequence) {
        System.out.println("Number: " + number + ", Runnable Item: " + runnableItem);
        System.out.println("Other Number: " + otherNumber + ", CharSequence: " + charSequence);

        // add two double values
        double sum = number.doubleValue() + otherNumber.doubleValue();
        System.out.println("Sum of numbers: " + sum);

        // execute run
        runnableItem.run();

        // Output the length of CharSequence
        System.out.println("Length of CharSequence: " + charSequence.length());
    }

    public static void main(String[] args) {
        MixedTypeContainer2<Integer, CustomRunnable2> container = new MixedTypeContainer2<>(10, new CustomRunnable2());
        container.executeAndPrint(20, "This is a CharSequence");

        MixedTypeContainer2<Double, AnotherRunnable2> anotherContainer = new MixedTypeContainer2<>(5.5, new AnotherRunnable2());
        anotherContainer.executeAndPrint(10.5, "Another CharSequence");
    }
}

class CustomRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("CustomRunnable2 is running...");
    }
}

class AnotherRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("AnotherRunnable2 is running...");
    }
}

