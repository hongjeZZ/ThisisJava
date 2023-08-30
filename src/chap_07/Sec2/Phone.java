package chap_07.Sec2;

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    public Phone(String model, String color) {
        System.out.println("phone() 생성자 실행");
        this.model = model;
        this.color = color;
    }
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    public void sendVoice(String message){
        System.out.println("자기 : " + message);
    }
    public void receiveVoice(String message) {
        System.out.println("상대방 : " + message);
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
