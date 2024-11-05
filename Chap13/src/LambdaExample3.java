@FunctionalInterface
interface Speakable {
    void speak(String content);
}

@FunctionalInterface
interface Workable3 {
    void work(String name, String job);
}

class Person3 {
    public void action1(Workable3 workable) {
        workable.work("홍길동", "프로그래밍");
    }
    public void action2(Speakable speakable) {
        speakable.speak("안녕하세요");
    }
}

public class LambdaExample3 {
    public static void main(String[] args) {
        Person3 person = new Person3();
        person.action1((name, job) -> { // two parameters
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> // two parameters, one statement { } 생략
                System.out.println(name + "이 " + job + "을 하지 않습니다."));
        person.action2(word -> { // one parameter
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });
        person.action2(word -> // one parameter, one statement { } 생략
                System.out.println("\"" + word + "\"라고 외칩니다."));
    }
}
