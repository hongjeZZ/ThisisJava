package chap_14.Sec03;

public class PrintThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++ ) {
            System.out.println("띵");
            try{
                Thread.sleep(1000);  // 예외처리가 필요한 코드 (일반 예외)
            } catch (Exception e){}
        }
    }
}
