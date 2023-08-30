package chap_09.Sec1;

public class A {
    // Field
    // Constructor
    // Method
    // Nested Class
    int field;

    B field2;

    A(){
        B b = new B();
        b.methodB();
    }

    void methodA(){
        B b = new B();
        b.methodB();
    }
    public class B{
        // Field
        // Constructor
        // Method
        public void methodB(){
            System.out.println("method B 실행");
        }

        static void methodB2(){
            System.out.println("static method B2 실행");
        }
    }
}
