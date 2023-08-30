package chap_03;

import chap_03.Singleton.Singleton;

public class CalculatorExample {
    public static void main(String[] args) {
        // 정적 메소드 및 필드를 사용할 때는 객체를 생성하지 않아도 된다.
        // 그리고 정적 메소드 및 필드를 사용 시 "클래스"에 도트를 붙여 사용한다.

        double result = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

        System.out.println("result : " + result);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
