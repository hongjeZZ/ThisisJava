package chap_03.Sec06.package2;

import chap_03.Sec06.package1.A;

public class C {
    public C() {
        A a = new A();

        a.field1 = 1;
        // a.field2 = 2;
        // a.field3 = 3; 디폴트랑 프라이빗이라 사용 불가

        a.method1();
        // a.method2();
        // a.method3(); 이것또한 마찬가지
    }
}
