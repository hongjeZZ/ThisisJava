package chap_09.Sec4.First;

public class A {
    // A의 일반 필드와 메소드
    int field1;
    void method1(){}

    // A의 정적 필드와 메소드
    static int field2;
    static void method2(){}

    // 인스턴스 멤버 클래스 (중첩 클래스)
    class B{
        void method3(){
            // A의 인스턴스 필드와 메소드 사용
            field1 = 10;
            method1();
        }
    }

    static class C{
        void method4(){
            field2 = 10;
            method2();
            // method();
            // field1 = 10;   ->    불가능
        }
    }

    public static void main(String[] args) {
        C c = new C();
        c.method4();
    }
}

/*정리
인스턴스 멤버 클래스(B) 는 바깥 클래스(A) 의 모든 필드와 메소드를 사용이 가능함
왜냐하면 인스턴스 멤버 클래스는 바깥 객체가 생성되어야 사용이 가능하기 때문. (이미 생성된 것이라 판정)

정적 멤버 클래스(C) 는 바깥 클래스(A) 의 정적 필드와 메소드만 사용 가능함
왜냐하면 정적 멤버 클래스는 바깥 객체의 생성 없이도 사용이 가능하기 때문.
 */
