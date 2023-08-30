package chap_09.Sec1;

public class AExample {
    public static void main(String[] args) {
        // A.B b = new A.B(); -> A부터 생성 해야함
        A.B.methodB2(); // static 메소드는 A 객체의 생성 없이 바로 실행가능
                        // static 메소드에는 객체 관련 코드가 불가능

        A a = new A();

        //a.methodA();

        a.field = 10;

        A.B b = a.new B();
        b.methodB();

    }
}
