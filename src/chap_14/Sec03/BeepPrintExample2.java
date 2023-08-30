package chap_14.Sec03;

// 스레드를 만드는 방법
// 1번. Thread 객체를 생성하고 매개변수로 Runnable 의 익명 클래스를 만듬 -> Run(); 재정의
// 2번. Thread 를 상속하는 자식 클래스를 만들고 Thread 의 Run(); 메소드를 재정의
// 3번. Thread 생성할 때 Thread 익명 객체를 만들어서 사용
import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {         // 익명 객체를 바로 생성하면서 새로운 스레드 객체 생성
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();  // 비프음을 위해 필요한 클래스
                for (int i = 0; i < 5; i++ ){
                    toolkit.beep();
                    try{
                        Thread.sleep(900);  // 예외처리가 필요한 코드 (일반 예외)
                    } catch (Exception e){}
                }
            }
        });

        thread.start();     // 새로운 스레드의 run()함수 시작.

        /*
        for (int i = 0; i < 5; i++ ) {
            System.out.println("띵");
            try{
                Thread.sleep(1000);  // 예외처리가 필요한 코드 (일반 예외)
            } catch (Exception e){}
        }
         */
        PrintThread pt = new PrintThread();
        pt.start();
    }
}
