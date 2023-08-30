package chap_03.exam1.package1;

public class B {
    public void method(){
        A a = new A();

        a.field1 = 1;
        a.field2 = 2;
        // a.field3 = 3;
        // 필드 3은 프라이빗이라 사용 불가 읽기 불가

        a.method1();
        a.method2();
        // a.method3();
        // 이것도 프라이빗 메소드라 사용 불가
    }
}
