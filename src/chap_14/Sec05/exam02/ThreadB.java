package chap_14.Sec05.exam02;

public class ThreadB extends Thread{
    private WorkObject workObject;

    public ThreadB(WorkObject workObject){
        setName("Thread B");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            workObject.methodA();
        }
    }
}
