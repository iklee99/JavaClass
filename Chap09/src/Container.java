// 제네릭 클래스를 정의합니다.
public class Container<T> {
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    // 제네릭 메서드 정의 (클래스의 타입 매개변수와 다른 타입 매개변수를 사용)
    public <U> void displayItemWithDetails(U detail) {
        System.out.println("Item: " + item);
        System.out.println("Detail: " + detail);
    }

    public static void main(String[] args) {
        // Container 클래스의 인스턴스를 생성 (String 타입 사용)
        Container<String> stringContainer = new Container<>("Apple");

        // Item과 추가적인 Detail을 출력 (Integer 타입 사용)
        stringContainer.displayItemWithDetails(123);

        // Container 클래스의 인스턴스를 생성 (Integer 타입 사용)
        Container<Integer> integerContainer = new Container<>(456);

        // Item과 추가적인 Detail을 출력 (String 타입 사용)
        integerContainer.displayItemWithDetails("Detail about 456");
    }
}
