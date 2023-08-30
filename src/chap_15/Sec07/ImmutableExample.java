package chap_15.Sec07;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {

        //List 불변 컬렉션 생성
        List<String> immutableList1 = List.of("A","B","C");
        // immutableList1.add("D");    ->    X

        //Set 불편 컬렉션 생성
        Set<String> immutableSet1 = Set.of("A","B","C");
        // immutableSet1.add("D");    ->    X

        //Map 불변 컬렉션 생성
        Map<String,Integer> immutableMap1 = Map.of(
                "A",1,
                "B",2,
                "C",3
        );
        // immutableMap1.put("D",4);    ->    X

        // List 컬렉션을 불변 List 컬렉션으로 복사
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        // Set 컬렉션을 불변 Set 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        // Set 컬렉션을 불변 Set 컬렉션으로 복사
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        Map<String,Integer> immutableMap2 = Map.copyOf(map);

        // 배열로부터 불편 리스트 생성
        String[] arr = {"A","B","C"};
        List<String> immutableList3 = Arrays.asList(arr);
    }
}
