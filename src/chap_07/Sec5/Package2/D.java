package chap_07.Sec5.Package2;

import chap_07.Sec5.Package1.A;

public class D extends A {

    // 상속을 통한 protected 사용
    public D(){
        // 부모 생성자 호출
        super();
    }
    public void method1(){
        // A 필드값 변경
        this.field = "value";
        // A 메소드 호출
        this.method();
    }

    /*
    // 직접 객체를 생성해서 사용하는 것은 안됨

    public void method2(){
        A a = new A();
        a.field = "value";
        a.method();
    }
    */
}
