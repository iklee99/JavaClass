// 상위 경계를 갖는 제네릭 클래스를 정의합니다.
public class NumberContainer<T extends Number> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    // 제네릭 메서드: 숫자 값을 두 배로 반환
    public double doubleValue() {
        return number.doubleValue() * 2;
    }

    public static void main(String[] args) {
        // Number의 하위 타입을 사용하는 제네릭 클래스의 인스턴스 생성
        NumberContainer<Integer> intContainer = new NumberContainer<>(5);
        System.out.println("Integer Value: " + intContainer.getNumber());
        System.out.println("Doubled Value: " + intContainer.doubleValue());

        NumberContainer<Double> doubleContainer = new NumberContainer<>(3.14);
        System.out.println("Double Value: " + doubleContainer.getNumber());
        System.out.println("Doubled Value: " + doubleContainer.doubleValue());

        // 컴파일 오류 발생: String은 Number의 하위 타입이 아니므로 허용되지 않음
        // NumberContainer<String> stringContainer = new NumberContainer<>("Hello");
    }
}
