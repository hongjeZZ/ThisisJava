package chap_08.Sec4;

import chap_08.Sec4.Audio;
import chap_08.Sec4.RemoteControl;
import chap_08.Sec4.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
        System.out.println("현재볼륨 : " + rc.getVolume());

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(7);

        rc.setMute(true);
        rc.setMute(false);
        System.out.println("현재볼륨 : " + rc.getVolume());




    }
}
