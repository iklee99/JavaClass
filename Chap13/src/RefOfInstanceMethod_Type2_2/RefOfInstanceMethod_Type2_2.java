package RefOfInstanceMethod_Type2_2;

interface A {
    int abc(String str);
}

public class RefOfInstanceMethod_Type2_2 {
    public static void main(String[] args) {
        //# 인스턴스 메서드 참조 Type2
        //@1. 익명이너클래스
        A a1 = new A() {
            @Override
            public int abc(String str) {
                return str.length();
            }
        };

        //@2.람다식
        A a2 = (String str)-> str.length();

        //@3. 인스턴스 메서드 참조 Type2
        A a3 = String::length;

        System.out.println(a1.abc("안녕"));
        System.out.println(a2.abc("안녕"));
        System.out.println(a3.abc("안녕"));

    }
}
