package chap_07.Sec4;

import chap_03.Computer;

public class SupersonicAirplane extends Airplane{
    // 상수를 이용해서 값을 지정
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    Computer com = new Computer();
    public int flyMode = NORMAL;

    // final 메소드는 오버라이딩 할 수 없다.
    @Override
    public void fly() {
        if (flyMode == SUPERSONIC){
            System.out.println("초고속 비행합니다.");
        }
        else{
            super.fly();
        }
    }
}
