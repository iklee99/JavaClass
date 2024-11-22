interface Bftl2 { // 입력 O   리턴 X
    void method2(int a);
}

interface Dftl2 { // 입력 O   리턴 O
    double method4(int a, double b);
}

public class FunctionToLambdaExpression2 {
    public static void main(String[] args) {

        Bftl2 b2 = (int a)->{System.out.println("a = " + a);};
        b2.method2(3);
        Dftl2 d4 = (a, b)-> a + b;
        System.out.println(d4.method4(2,3));

    }
}
