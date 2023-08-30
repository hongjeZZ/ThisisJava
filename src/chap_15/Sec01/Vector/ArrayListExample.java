package chap_15.Sec01.Vector;

import java.util.List;
import java.util.Vector;

// 벡터와 ArrayList 의 차이점 - 사용구분
// 벡터는 동기화된 메소드로 구성되어 있다. 모든게 싱크로나이즈가 붙어있다.
// 즉. 한 스레드가 벡터를 사용할 동안 다른 스레드는 벡터를 사용할 수 없음.
// 싱글 스레드 환경에서는 무엇을 써도 괜찮지만, 멀티 스레드 환경에서는 공유 객체로 ArrayList 를 사용할 때 문제가 발생할 수 있다.

public class ArrayListExample {
    public static void main(String[] args) {

        List<Board> list = new Vector<>();
        // List<Board> list = new ArrayList<>();
        // 둘의 실행 결과가 다르다. -> 왜 벡터를 사용해야 하는 지
        // 벡터 객체를 스레드가 동시에 사용할 수 없기 때문에 문제가 발생하지 않는다.

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++){
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++){
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };

        // 스레드 시작
        threadA.start();
        threadB.start();

        // 스레드가 끝날 때까지 메인 스레드를 대기시킴
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e){}

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
    }
}
