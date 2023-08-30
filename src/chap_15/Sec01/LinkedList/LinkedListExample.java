package chap_15.Sec01.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Linked list 는 ArrayList 와는 다른 내부구조를 가지고 있다.
// ArrayList 는 내부 배열에 객체를 저장하지만, Linked List 는 인접 객체를 체인처럼 관리한다.
// 따라서 Linked list 는 객체를 수정할 때 인접 링크만 수정하면 되므로 빈번한 객체 삽입, 수정에서는 훨씬 좋은 성능을 발휘한다.

public class LinkedListExample {
    public static void main(String[] args) {

        // ArrayList 컬렉션 객체 생성
        List<String> list = new ArrayList<>();

        // LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        // 작업 시간 측정 후 출력
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            list.add(0,String.valueOf(i));  // 정수 i를 문자열로 바꾸는 코드
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n","ArrayList  걸린 시간: ",endTime - startTime);



        // 작업 시간 측정 후 출력
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            list2.add(0,String.valueOf(i));  // 정수 i를 문자열로 바꾸는 코드
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n","LinkedList 걸린 시간: ",endTime - startTime);
    }
}
