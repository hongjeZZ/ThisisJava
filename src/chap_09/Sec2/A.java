package chap_09.Sec2;

public class A {
    static class B{

        int field1 = 1;
        static int field2 = 2;
        static void methodB(){
            System.out.println("method B 실행");
        }
    }

    // Field
    B field1 = new B(); // 이게 가능한 이유는 이 필드는 A 객체가 생성될 때 생성되므로 이미 A 객체가 있다고 판단하기 때문
    // static class 에서는 static 필드를 통해 A 객체 외부에서도 A 객체의 생성없이 B를 생성할 수 있다.
    static B field2 = new B();
    // B field3 = new B(); -> 불가능

    // Method
    void method1(){
        B field1 = new B();
    }

    static void method2(){
        B field1 = new B();
    }
}
