interface Aftl { // 입력 X   리턴 X
    void method1();
}
interface Bftl { // 입력 O   리턴 X
    void method2(int a);
}
interface Cftl { // 입력 X   리턴 O
    int method3();
}
interface Dftl { // 입력 O   리턴 O
    double method4(int a, double b);
}

public class FunctionToLambdaExpression {
    public static void main(String[] args) {

        //인터페이스의 함수 구현 --> 람다식
        //#1. 입력 X   리턴 X
        //@1-1 익명이너클래스 방식
        Aftl a1 = new Aftl() {
            @Override
            public void method1() {
                System.out.println("입력 x 리턴 x 함수");
            }
        };
        //@1-2  람다식 표현
        Aftl a2 = ()->{System.out.println("입력 x 리턴 x 함수");};
        Aftl a3 = ()->System.out.println("입력 x 리턴 x 함수"); //중괄호 삭제 가능 (한줄 명령일때만 가능)

        //#2. 입력 O   리턴 X
        //@2-1 익명이너클래스 방식
        Bftl b1 = new Bftl() {
            @Override
            public void method2(int a) {
                System.out.println("입력 O 리턴 x 함수");
            }
        };

        //@2-2  람다식 표현
        Bftl b2 = (int a)->{System.out.println("입력 O 리턴 x 함수");};
        Bftl b3 = (a)->{System.out.println("입력 O 리턴 x 함수");}; //입력매개변수 생략 가능
        Bftl b4 = (a)->System.out.println("입력 O 리턴 x 함수"); //중괄호 삭제 가능 (한줄 명령일때만 가능)
        Bftl b5 = a->System.out.println("입력 O 리턴 x 함수"); //입력 매개변수가 하나인 경우 소괄호도 생략가능

        b2.method2(3);

        //#3. 입력 X   리턴 O
        //@3-1 익명이너클래스 방식
        Cftl c1 = new Cftl() {
            @Override
            public int method3() {
                return 4;
            }
        };

        //@3-2  람다식 표현
        Cftl c2 = ()->{ return 4; };
        Cftl c3 = ()->4;

        //#4. 입력 O   리턴 O
        //@4-1 익명이너클래스 방식
        Dftl d1 = new Dftl() {
            @Override
            public double method4(int a, double b) {
                return a+b;
            }
        };

        //@4-2  람다식 표현
        Dftl d2 = (int a, double b)->{return a+b;};
        Dftl d3 = (a, b)->{return a+b;};
        Dftl d4 = (a, b)-> a+b;

        System.out.println(d4.method4(2,3));

    }
}









