package chap_14.Sec07.exam1;

// 스레드 풀의 작업 큐에는 Runnable 객체가 들어간다.
// Runnable, Callable 의 차이점은 리턴 값을 받는 것에 차이가 있다.

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        // 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);   // 스레드의 수
        // 작업 생성과 처리 요청
        // 스레드 풀 종료
        executorService.shutdown();
    }
}
