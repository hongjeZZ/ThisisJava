package chap_03.Sec05;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // 세터를 먼저
        myCar.setSpeed(-50);
        // 게터를 사용하여 값을 읽는다.
        System.out.println(myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println(myCar.getSpeed());

        // 자동차가 움직이고 있다면 멈추겠다.
        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        // 자동차가 멈춘 상태라면 속도를 0으로 만듬
        System.out.println(myCar.getSpeed());
    }
}
