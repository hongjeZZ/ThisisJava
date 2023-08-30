package chap_14.Sec05.exam01;

public class SynchronizedExample {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calculator);
        user1Thread.start();

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
        // 결과값이 50, 50 인 이유는 2초 일시정지동안 메모리의 값을 100 -> 50 으로 바뀌기 때문
        // Calculator 의 setMemory 메소드를 synchronized void setMemory 로 바꿈으로써 하나의 스레드가 메소드를 실행할 때 객체를 잠군다.
    }
}
