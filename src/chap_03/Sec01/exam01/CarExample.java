package chap_03.Sec01.exam01;

public class CarExample {
    public static void main(String[] args) {
        // 객체 생성
        // 생성자 오버로딩
        // 다른 생성자 호출
        Car myCar1 = new Car("자가용");
        System.out.println("모델 : " + myCar1.model);
        System.out.println("색상 : " + myCar1.color);
        System.out.println("최고속도 : " + myCar1.maxSpeed);

        Car myCar2 = new Car("자가용","검정");
        System.out.println("모델 : " + myCar2.model);
        System.out.println("색상 : " + myCar2.color);
        System.out.println("최고속도 : " + myCar2.maxSpeed);

        Car myCar3 = new Car("자가용", "검정",150);
        System.out.println("모델 : " + myCar3.model);
        System.out.println("색상 : " + myCar3.color);
        System.out.println("최고속도 : " + myCar3.maxSpeed);

    }
}
