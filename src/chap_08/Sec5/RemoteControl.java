package chap_08.Sec5;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 3 가지의 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    int getVolume();

    // 디폴트 메소드
    // 객체가 인터페이스에 있어야만 실행할 수 있음
    // 객체 공통으로 사용할 수 있는 메소드
    default void setMute(boolean mute){
        if (mute == true){
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        }
        else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery(){
        System.out.println("리모컨 건전지를 교환합니다.");
    }
}
