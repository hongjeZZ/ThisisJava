package chap_15.Sec03.HashMap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("안홍제", 19);
        map.put("홍길동", 24);
        map.put("이순신", 24);
        map.put("안홍제", 24);      // 키 값은 중복되지 않음, 마지막으로 추가된 엔트리만 저장됨 ( 그 전 엔트리는 삭제 )

        int size = map.size();
        System.out.println("총 엔트리 수 : " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "안홍제";
        int value = map.get(key);
        System.out.println(key + " : " + value);
        System.out.println();

        // 키 set 컬렉션을 얻고 반복해서 값을 찾기
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String k = iterator.next();
            int v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 키 entry 컬렉션을 얻고, 반복해서 키와 값을 찾기
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();                   // Entry 객체로 이루어진 set 컬렉션 생성
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();    // set 컬렉션을 반복하기위해 반복자 entryIterator 생성
        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();                 // Entry 객체를 생성하고 반복하며 set 컬렉션의 entry 를 대입
            String k = entry.getKey();
            int v = entry.getValue();
            System.out.println(k + " : " + v);
        }
    }
}