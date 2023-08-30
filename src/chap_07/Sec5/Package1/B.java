package chap_07.Sec5.Package1;

public class B {
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();

        // protected 여도 같은 패키지 내에서는 사용가능
    }
}
