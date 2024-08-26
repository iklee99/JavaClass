// Generic 클래스 Box 정의
class Box<T> {
    // T 타입의 객체를 저장하는 멤버 변수
    private T item;

    // 생성자
    public Box(T item) {
        this.item = item;
    }

    // 객체를 반환하는 메서드
    public T getItem() {
        return item;
    }

    // 객체를 설정하는 메서드
    public void setItem(T item) {
        this.item = item;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Integer 타입의 Box 인스턴스 생성
        Box<Integer> intBox = new Box<>(123);
        System.out.println("Integer value: " + intBox.getItem());

        // String 타입의 Box 인스턴스 생성
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String value: " + strBox.getItem());

        // Double 타입의 Box 인스턴스 생성
        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println("Double value: " + doubleBox.getItem());

        // 객체의 값을 변경
        strBox.setItem("New String Value");
        System.out.println("Updated String value: " + strBox.getItem());
    }
}
