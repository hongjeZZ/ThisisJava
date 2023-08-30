package chap_14.Sec02;

public class MainThreadExample {
    public static void main(String[] args) {

        System.out.println("시작");

        Thread currThread = Thread.currentThread();
        System.out.println(currThread.getName());           // main

        System.out.println("종료");
    }
}
