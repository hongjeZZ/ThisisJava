package chap_08.Sec6;
// 하나의 객체를 두 개의 인터페이스로 사용

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable sc = new SmartTelevision();

        sc.search("www.yatv.com");
    }
}
