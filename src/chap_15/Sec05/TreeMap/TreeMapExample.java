package chap_15.Sec05.TreeMap;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<String,Integer> treeMap = new TreeMap<>();

        // Key 값을 기준으로 오름차순으로 정렬 "a" -> 첫번째 / "z" -> 마지막

        treeMap.put("apple",10);
        treeMap.put("forever",60);
        treeMap.put("description",40);
        treeMap.put("ever",50);
        treeMap.put("zoo",80);
        treeMap.put("base",20);
        treeMap.put("guess",70);
        treeMap.put("cherry",30);

        // 정렬된 엔트리를 가져오기
        Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();

        // 특정 엔트리 가져오기
        Map.Entry<String,Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞 단어 : " + entry.getKey() + " - " + entry.getValue());

        entry = treeMap.lastEntry();
        System.out.println("제일 뒤 단어 : " + entry.getKey() + " - " + entry.getValue());

        entry = treeMap.lowerEntry("ever");
        System.out.println("'ever' 앞 단어 : " + entry.getKey() + " - " + entry.getValue());

        System.out.println();

        // 내림차순으로 정렬
        NavigableMap<String,Integer> descendingMap = treeMap.descendingMap();
        Set<Map.Entry<String,Integer>> descendingSet = descendingMap.entrySet();
        for (Map.Entry<String,Integer> entry1 : descendingSet)
        {
            System.out.println(entry1.getKey() + " - " + entry1.getValue());
        }
        System.out.println();

        // 범위 검색 ('c' =<  && < 'h')
        NavigableMap<String,Integer> rangeMap = treeMap.subMap("c",true,"h",false);
        Set<Map.Entry<String,Integer>> rangeSet = rangeMap.entrySet();
        for (Map.Entry<String,Integer> rangeEntry : rangeSet){
            System.out.println(rangeEntry.getKey() + " - " + rangeEntry.getValue());
        }
    }
}
