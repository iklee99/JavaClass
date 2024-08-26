// T는 Number를 상속받는 타입으로, U는 Runnable을 구현하는 타입으로 제한합니다.
public class MixedTypeContainer<T extends Number, U extends Runnable> {
    private T number;
    private U runnableItem;

    public MixedTypeContainer(T number, U runnableItem) {
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

    // 두 개의 다른 bounded 타입 매개변수를 사용하는 제네릭 메서드
    public <V extends Number, W extends CharSequence> void executeAndPrint(V otherNumber, W charSequence) {
        System.out.println("Number: " + number + ", Runnable Item: " + runnableItem);
        System.out.println("Other Number: " + otherNumber + ", CharSequence: " + charSequence);

        // 두 숫자 값을 더합니다.
        double sum = number.doubleValue() + otherNumber.doubleValue();
        System.out.println("Sum of numbers: " + sum);

        // Runnable을 실행합니다.
        runnableItem.run();

        // CharSequence의 길이를 출력합니다.
        System.out.println("Length of CharSequence: " + charSequence.length());
    }

    public static void main(String[] args) {
        // T는 Integer, U는 Runnable 타입으로 제한된 인스턴스를 생성합니다.
        MixedTypeContainer<Integer, CustomRunnable> container = new MixedTypeContainer<>(10, new CustomRunnable());

        // 다른 Number와 CharSequence 값을 비교하고 더하는 메서드를 호출합니다.
        container.executeAndPrint(20, "This is a CharSequence");

        // T는 Double, U는 또 다른 Runnable 타입으로 제한된 또 다른 인스턴스를 생성합니다.
        MixedTypeContainer<Double, AnotherRunnable> anotherContainer = new MixedTypeContainer<>(5.5, new AnotherRunnable());

        // 다른 Number와 CharSequence 값을 비교하고 더하는 메서드를 호출합니다.
        anotherContainer.executeAndPrint(10.5, "Another CharSequence");
    }
}

// CustomRunnable 클래스는 Runnable을 구현합니다.
class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("CustomRunnable is running...");
    }
}

// AnotherRunnable 클래스도 Runnable을 구현합니다.
class AnotherRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("AnotherRunnable is running...");
    }
}

