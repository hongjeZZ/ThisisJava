package chap_08.Sec7;
// 이 인터페이스는 부모에게서 하나의 메소드 씩을 물려 받았으므로
// 자신의 메소드까지 포함하여 3개의 메소드를 가지고 있다.
// 그러므로 이 인터페이스로 구현한 클래스는 3개의 메소드를 재정의 해야 한다.

// 또한, 인터페이스는 다중 상속이 가능하므로
// 하나의 인터페이스는 여러 부모를 가질 수 있다
// 상속되는 것은 디폴트 메소드와 추상 메소드이다.
public interface InterfaceA {
    void methodA();
}
