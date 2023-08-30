package chap_14.Sec06.exam3;


public class DemonExample {
    public static void main(String[] args) {

        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            
        }

        System.out.println("메인 스레드 종료");
    }
}
