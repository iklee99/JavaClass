@FunctionalInterface
interface Workable {
    void work();
}

class Person {
    public void action(Workable workable) {
        workable.work();
    }
}

public class LambdaExample2 {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(() -> { // no parameter lambda expression
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        // no parameter lambda expression
        person.action(() -> System.out.println("퇴근 합니다."));
    }
}
