package chap_15.Sec02.exam3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("안홍제");
        set.add("최도란");
        set.add("이인표");
        set.add("김앤장");
        set.add("정지훈");
        set.add("이정택");

        // Iterator 인터페이스 객체 생성
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){      // iterator.hasNext() 는 가져올 것이 남았다면 true, 아니면 false 를 반환
            String element = iterator.next();   // iterator.next() 는 다음 객체를 가져온다.
            System.out.println(element);

            if (element.equals("김앤장")){
                iterator.remove();          // iterator.remove() 는 해당 객체를 삭제 ****(set 에서 삭제함)
            }
        }
        System.out.println();

        set.remove("정지훈");

        // 향상된 for 문을 이용하여 출력       ->      이것으로는 삭제는 불가능 (읽기만 가능)
        for (String s : set){
            System.out.println(s);
        }
    }
}
