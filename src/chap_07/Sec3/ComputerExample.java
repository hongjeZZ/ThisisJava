package chap_07.Sec3;

import chap_03.package2.C;

public class ComputerExample {
    public static void main(String[] args) {

        int r = 10;

        Calculator calculator = new Calculator();
        Computer computer = new Computer();

        System.out.println(calculator.areaCircle(r));
        System.out.println(computer.areaCircle(r));
    }
}
