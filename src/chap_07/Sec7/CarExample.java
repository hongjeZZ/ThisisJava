package chap_07.Sec7;

public class CarExample {
    public static void main(String[] args) {

        // 다형성을 위해 필요한 기술 = 1.자동 타입 변환 2.메소드 오버라이딩
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
