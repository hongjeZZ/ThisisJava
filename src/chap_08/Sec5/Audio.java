package chap_08.Sec5;

// 인터페이스 중 static 메소드
// 인터페이스 소속 메소드

// 인터페이스 중 private 메소드
// private 이므로 인터페이스에서 밖에 사용 못함
// default 메소드나 static 메소드를 작성할 때 서로 겹치는 부분이 있다면
// 코드의 작성을 줄이기 위하여 private 메소드를 사용한다.

public class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    public int getVolume(){
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        }
        else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨 : " + this.volume);
    }

    private int memoryVolume;

    // 디폴트 메소드를 사용하면 객체마다 코드를 쓰는 피로를 덜 수 있다.
    // 하지만 모든 객체에 적용되기 때문에 수정을 하기 위해서는 원하는 클래스에서 오버라이딩 할 수 있다.
    // 오버라이딩 할 때 주의점은 default 가 아닌 public 접근 제한자로 오버라이딩 해야 한다.

    @Override
    public void setMute(boolean mute) {
        if (mute == true){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        }
        else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
