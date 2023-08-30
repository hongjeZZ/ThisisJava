package chap_07.Sec3;

public class Computer extends Calculator{
    // 메소드 오버라이딩
    // 자식 객체에서 d 만 쳐도 인텔리제이에서 알려줌
    // 이때 super.method(); 가 나오는데 이거는 부모의 코드
    // 이 코드를 앞뒤로 수정가능 하지만 부모 코드 안의 내용은 수정 불가능

    // 수정 시 주의 사항
    // 1. 부모의 선언부와 동일해야함 (매개변수, 타입, 메소드 이름)
    // 2. 접근 제한을 강하게 오버라이딩 불가 (public -> default 불가)
    // 3. 새로운 예외를 throws 할 수 없다.
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
