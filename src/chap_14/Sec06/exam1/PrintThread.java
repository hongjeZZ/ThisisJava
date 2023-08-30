package chap_14.Sec06.exam1;

public class PrintThread extends Thread{
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop)           // while 문을 사용하여 최소한의 리소스는 정리하고 종료하도록 함
        {
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
