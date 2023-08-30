package chap_08.Sec10;

import chap_07.Sec5.Package2.D;

public class DriverExample {
    public static void main(String[] args) {
        Driver dr = new Driver();


        // 매개변수의 다형성

        dr.drive(new Bus());
        dr.drive(new Taxi());
    }
}
