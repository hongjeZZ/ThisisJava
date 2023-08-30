package chap_09.Sec2;

public class AExample {
    public static void main(String[] args) {

        // A 객체 없이 생성 가능한 static class B
        A.B b = new A.B();

        b.methodB();    // 변수를 통해 사용
        A.B.methodB();  // 객체 생성 없이 사용

        // System.out.println(A.B.field1); -> 객체 없이 사용 불가
        System.out.println(b.field1);   // 변수를 통해 사용
        System.out.println(A.B.field2); // static 이라서 사용 가능
    }
}
