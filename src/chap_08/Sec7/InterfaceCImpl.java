package chap_08.Sec7;

public class InterfaceCImpl implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("메소드 A 실행");
    }

    @Override
    public void methodB() {
        System.out.println("메소드 B 실행");
    }

    @Override
    public void methodC() {
        System.out.println("메소드 C 실행");
    }
}
