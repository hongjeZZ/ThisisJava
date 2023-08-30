package chap_08.Sec6;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("전원을 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "를 검색합니다.");
    }
}
