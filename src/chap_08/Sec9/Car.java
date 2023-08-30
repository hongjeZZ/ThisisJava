package chap_08.Sec9;

public class Car {
    // 금호, 한국 타이어 둘 다 쓰기 위해 인터페이스인 Tire 타입으로 필드 선언
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}

