// 두 개의 타입 매개변수를 사용하는 제네릭 클래스
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        // Pair 클래스의 인스턴스 생성
        Pair<String, Integer> studentGrade = new Pair<>("Alice", 95);
        Pair<String, String> countryCapital = new Pair<>("Germany", "Berlin");

        // Pair의 값을 출력
        System.out.println(studentGrade); // 출력: Pair{key=Alice, value=95}
        System.out.println(countryCapital); // 출력: Pair{key=Germany, value=Berlin}

        // 값 가져오기
        String student = studentGrade.getKey();
        int grade = studentGrade.getValue();
        System.out.println("Student: " + student + ", Grade: " + grade); // 출력: Student: Alice, Grade: 95

        // 값 설정하기
        studentGrade.setKey("Bob");
        studentGrade.setValue(85);
        System.out.println("Updated: " + studentGrade); // 출력: Updated: Pair{key=Bob, value=85}
    }
}

