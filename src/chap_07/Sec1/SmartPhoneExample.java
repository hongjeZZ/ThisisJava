package chap_07.Sec1;

public class SmartPhoneExample {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("아이폰","그래파이트");
        // 상속(부모) 필드
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        // 자식 필드
        System.out.println(myPhone.wifi);

        // 상속(부모) 메소드
        myPhone.bell();
        myPhone.sendVoice("여보세요?");
        myPhone.receiveVoice("안녕하세요! 저는 안홍제인데요!");
        myPhone.sendVoice("아 ! 네 반갑습니다.");
        myPhone.hangUp();
        // 자식 메소드
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
