@FunctionalInterface
interface Calcuable4 {
    double calc(double x, double y);
}

class Person4 {
    public void action(Calcuable4 calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}

public class LambdaExample4 {
    public static void main(String[] args) {
        Person4 person = new Person4();

        person.action((x, y) -> { // two statement, return value
            double result = x + y;
            return result;
        });

        // return만 있는 경우, return 생략 가능
        person.action((x, y) -> (x + y));

        // return만 있는 경우, method call로 대치 가능
        person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}

