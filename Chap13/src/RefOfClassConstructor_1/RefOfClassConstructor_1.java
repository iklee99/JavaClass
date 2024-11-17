package RefOfClassConstructor_1;

interface A {
    B abc();
}

class B {
    B() {
        System.out.println("첫번째 생성자");
    }
    B(int k) {
        System.out.println("두번째 생성자");
    }
}

public class RefOfClassConstructor_1 {
    public static void main(String[] args) {
        //클래스 생성자 참조
        //@1 익명이너클래스
        A a1 = new A() {
            @Override
            public B abc() {
                return new B();
            }
        };

        //@2.람다식
        A a2 = ()-> new B();

        //@3. 클래스 생성자 참조
        A a3 = B::new;

        a1.abc(); //첫번째 생성자
        a2.abc(); //첫번째 생성자
        a3.abc(); //첫번째 생성자
    }
}






