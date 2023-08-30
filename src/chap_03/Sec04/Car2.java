package chap_03.Sec04;

public class Car2 {
    // 설계도(라이브러리용) 부분
    int speed;
    // final 필드 선언
    final double maxSpeed = 90.0;
    // 상수 선언 (대문자로 작성)
    static final double PI = 3.141592;

    void run(){
        // 인스턴스 필드는 인스턴스 메소드에서 바로 사용가능
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate(){
        // 정적 메소드에서는 객체를 생성한 후 사용가능
        Car2 myCar = new Car2();
        myCar.speed = 200;
        myCar.run();
    }

    // 실행 부분
    public static void main(String[] args) {
        // 정적 메인 메소드에서는 같은 클래스 내의 정적 메소드 사용가능
        // 근데 설계도랑 실행을 같이 만들 일은 없으므로 중요하진 않음
        simulate();

        // 여기가 중요한 부분으로 정적 메소드에서 인스턴스 메소드 및 필드를 사용할 때는 꼭 객체를 생성하고 사용할 수 있다.
        Car2 myCar = new Car2();
        myCar.speed = 60;
        myCar.run();
    }
}
