package chap_08.Sec11;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        Vehicle vehicle = bus;
        vehicle.run();
        // vehicle.checkFare(); 불가능 -> 강제 타입 변환의 수요가 생김
        //                               근데 웬만하면 잘 안씀


        if (vehicle instanceof Bus bus1)    // vehicle 이 Bus 의 구현 객체가 맞는 지 확인하고 맞다면 bus1을 선언 후 강제 타입 변환
        {
            bus1.checkFare();
        }
    }
}
