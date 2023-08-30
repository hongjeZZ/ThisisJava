package chap_08.Sec3;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 3 가지의 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
