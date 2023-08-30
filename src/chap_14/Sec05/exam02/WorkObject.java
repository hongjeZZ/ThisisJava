package chap_14.Sec05.exam02;

// wait, notify 메소드는 동기화 메소드 or 동기화 블록 내에서만 사용될 수 있다.
// 공유객체 (WorkObject) 에서 두 스레드가 작업할 내용을 동기화 메소드로 적어놓는게 핵심이다.

public class WorkObject {
    public synchronized void methodA(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+ ": methodA 작업 실행");
        notify();           // 다른 스레드를 실행 대기로 만듬
        try {
            wait();         // 자신의 스레드를 일시정지
        } catch (Exception e){}
    }

    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+ ": methodB 작업 실행");
        notify();           // 다른 스레드를 실행 대기로 만듬
        try {
            wait();         // 자신의 스레드를 일시정지
        } catch (Exception e){}
    }
}
