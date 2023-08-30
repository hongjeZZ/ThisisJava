package chap_07.Sec8;

public class DriverExample {
    public static void main(String[] args) {
        // 매개변수의 다형성
        Driver driver = new Driver();

        // driver.drive(new Vehicle());

        Vehicle vehicle = new Vehicle();
        driver.drive(vehicle);

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);


    }
}
