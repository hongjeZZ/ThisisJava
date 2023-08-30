package chap_15.Sec02.exam1;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet <String> set = new HashSet<>();

        // 5개의 문자열 객체 저장

        set.add("java");
        set.add("DOC");
        set.add("jSP");
        set.add("jpa");
        set.add("java");        // 중복

        int size = set.size();

        System.out.println("총 객체 수 : " + size);  // 4개
    }
}
