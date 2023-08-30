package chap_15.Sec02.exam2;

import java.util.HashSet;

public class MemberSetExample {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();

        set.add(new Member("홍길동",19));
        set.add(new Member("홍길동",19));
        set.add(new Member("안홍제",24));

        int size = set.size();

        System.out.println("총 객체 수 : " + size);

    }
}
