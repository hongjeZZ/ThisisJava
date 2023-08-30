package chap_03.Sec05;

public class Car {
    private int speed;

    // boolean 은 아무것도 안넣으면 false 로 초기화
    private boolean stop;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed < 0)
        {
            this.speed = 0;
            return;
        } else
            this.speed = speed;
    }
    public boolean isStop()
    {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true)
        {
            this.speed = 0;
        }
    }
}
