package chap_12.Sec07;

import java.util.Random;

public class MathClassExample {
    public static void main(String[] args) {
        // 난수 구하기
        int num = (int)(Math.random()*6) + 1;              // Math 클래스의 정적 메소드 사용
        int num1 = new Random().nextInt(6) + 1;     // Random 클래스 사용

        System.out.println(num);
        System.out.println(num1);
    }
}
