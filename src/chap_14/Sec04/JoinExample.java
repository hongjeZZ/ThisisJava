package chap_14.Sec04;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.run();
        try{
            sumThread.join();
            // join 을 통해 main 스레드의 작동을 일시정지 시키고, sumThread 의 작업이 끝나면 main 다시 실행
        } catch (InterruptedException e) {}

        System.out.println(sumThread.getSum());
        // join 을 쓰지 않는다면 sum 이 0으로 출력될 수 있다.
    }
}
