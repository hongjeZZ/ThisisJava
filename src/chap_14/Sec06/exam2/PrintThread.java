package chap_14.Sec06.exam2;

public class PrintThread extends Thread{
    @Override
    public void run() {
        try{
            while (true)
            {
                System.out.println("실행 중 ...");
                //Thread.sleep(1);                      // 여기에 일시정지로 가는 코드가 무조건 있어야함 (이건 비효율적이지 않느냐 ?)
                if (Thread.interrupted()){              // 일시정지를 위해 일부로 넣었기 때문에 비효율적 그 방안 -> Thread.interrupted();
                    break;                              // interrupt() 가 실행되었다면 break; -> 이러면 try, catch 도 필요없다.
                }
            }
        }catch (Exception e){}
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
