package chap_08.Sec9;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new KumhoTire();

        // 코드는 똑같지만 실행결과가 달라짐 -> 인터페이스의 다형성
        myCar.run();
    }
}
