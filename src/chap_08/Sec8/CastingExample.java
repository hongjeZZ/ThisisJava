package chap_08.Sec8;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); 불가능

        Bus bus = (Bus) vehicle;    // 강제 타입 변환 **

        bus.checkFare();
        bus.run(); // 둘 다 가능
    }
}
