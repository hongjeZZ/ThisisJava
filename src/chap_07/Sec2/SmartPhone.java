package chap_07.Sec2;

public class SmartPhone extends Phone {

    // 필드선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone (String model, String color){
        // 부모 클래스에 매개변수가 필요할 때 super()에 매개값 넣어줌
        super(model,color);
        System.out.println("SmartPhone() 생성자 실행");
        /*
        this.model = model;
        this.color = color;
        */
    }

    //메소드 선언
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
