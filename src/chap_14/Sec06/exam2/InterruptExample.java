package chap_14.Sec06.exam2;

// interrupt 메소드는 스레드가 일시정지 상태에 있을 때 예외를 발생시킨다.
// 예외가 발생하면 try 구문을 나와 catch 구문으로 코드가 이동하니 이것을 통해 스레드를 안전종료하는 방법으로 쓰인다.

public class InterruptExample {
    public static void main(String[] args) {

        PrintThread printThread = new PrintThread();
        printThread.start();

        try{
            Thread.sleep(3000);
        } catch (Exception e){}

        printThread.interrupt();
    }
}
