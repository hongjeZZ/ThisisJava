package chap_14.Sec06.exam3;
// 데몬 스레드는 주 스레드를 돕는 보조역할로써 주 스레드가 죽으면 같이 종료된다.
// 스레드를 데몬으로 만드는 메소드는 주 스레드(main)가 데몬이 될 스레드(AutoSaveThread)의 setDaemon(true)를 실행하면 된다.
public class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(1000);
            } catch (Exception e){}
            break;
        }
        save();
    }
}
