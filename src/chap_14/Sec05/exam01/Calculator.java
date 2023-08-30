package chap_14.Sec05.exam01;

// 공유 객체
public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    // 동기화 블록의 선언
    public void setMemory2(int memory) {
        synchronized (this){     /* 공유객체에 대한 참조 */
            this.memory = memory;
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
