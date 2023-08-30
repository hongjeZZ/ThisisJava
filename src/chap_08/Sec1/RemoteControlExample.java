package chap_08.Sec1;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // 인터페이스 변수에 구현 객체 대입
        rc = new Television();

        // 변수를 통해 인터페이스의 추상 메소드 사용
        rc.turnOn();
    }
}
