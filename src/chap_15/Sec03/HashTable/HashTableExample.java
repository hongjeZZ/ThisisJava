package chap_15.Sec03.HashTable;

// List 컬렉션의 Vector 와 마찬가지로 HashTable 은 모든 메소드가 싱크로나이즈드 되어 있어서 멀티 스레드 환경에서 사용이 용이하다.

import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {

        Hashtable<String,Integer> map = new Hashtable<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++){
                    map.put(String.valueOf(i),i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++){
                    map.put(String.valueOf(i),i);
                }
            }
        };

        // 스레드 시작
        threadA.start();
        threadB.start();

        // 스레드가 끝날 때까지 메인 스레드를 대기시킴
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e){}

        int size = map.size();
        System.out.println("총 객체 수 : " + size);
    }
}
