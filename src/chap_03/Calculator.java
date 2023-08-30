package chap_03;

public class Calculator {
    // 정적 필드와 정적 메소드
    static double pi = 3.14159;

    static int plus(int x, int y){
        int result = x + y;
        return result;
    }

    static int minus(int x, int y){
        int result = x - y;
        return result;
    }
}
