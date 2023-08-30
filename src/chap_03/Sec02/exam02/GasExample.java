package chap_03.Sec02.exam02;

public class GasExample {
    public static void main(String[] args) {
        Gas g1 = new Gas();
        g1.setGas(5);
        if (g1.isleftGas() == true)
            System.out.println("출발합니다.");
        g1.run();
    }
}
