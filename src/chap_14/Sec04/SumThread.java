package chap_14.Sec04;

public class SumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
    }
}
