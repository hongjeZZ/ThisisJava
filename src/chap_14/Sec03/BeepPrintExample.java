package chap_14.Sec03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();  // 비프음을 위해 필요한 클래스
        for (int i = 0; i < 5; i++ ){
            toolkit.beep();
            try{
                Thread.sleep(500);  // 예외처리가 필요한 코드 (일반 예외)
            } catch (Exception e){}
        }
        for (int i = 0; i < 5; i++ ) {
            System.out.println("띵");
        }

        // 이렇게 하면 비프음이 울리고 나서 "띵"이 출력된다. 동시 작업을 원하면 하나의 작업을 새로운 스레드로 만들어야 한다.
    }
}
