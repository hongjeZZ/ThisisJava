package chap_14.Sec07.exam2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
    public static void main(String[] args) {

        // 1000개의 메일 생성
        String[][] emails = new String[1000][3];

        for (int i = 0; i < emails.length; i++){
            emails[i][0] = "admin@my.com";
            emails[i][1] = "member" + i + "@my.com";
            emails[i][2] = "신상품 입고 !!";
        }

        // 스레드 풀의 생성 (최대 스레드 수 : 5)
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 1000; i++){
            final int idx = i;                          // 로컬변수를 로컬블록 안에서 사용하면 final 특성을 갖기 때문에 값으 바꾸지 못한다.
                                                        // 그래서 i를 사용하지 않고 final 특성을 갖는 idx 를 선언하여 사용한다.

            executorService.execute(new Runnable() {    // 작업큐에 Runnable 객체를 저장
                                                        // 알아서 작업이 끝난 스레드에 새로운 작업을 넣는다 (이건 알 필요 없음)
                @Override
                public void run() {
                    // 이메일을 보내는 작업 내용
                    Thread thread = Thread.currentThread();
                    String from = emails[idx][0];
                    String to = emails[idx][1];
                    String content = emails[idx][2];
                    System.out.println("[" + thread.getName() + "]" + from + " ==> " + to + ": " + content);
                }
            });
        }

        executorService.shutdown();
    }
}
