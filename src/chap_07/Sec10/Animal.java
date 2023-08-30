package chap_07.Sec10;

public abstract class Animal {
    // 추상 클래스는 생성할 수 없다.
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    // 추상 메소드는 {}를 생략한다.
    public abstract void sound();
}
