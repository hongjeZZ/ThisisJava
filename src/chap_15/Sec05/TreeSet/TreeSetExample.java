package chap_15.Sec05.TreeSet;
// TreeSet 은 부모 노드 객체와 비교해서 작은 것을 왼쪽 큰 것을 오른쪽에 저장한다.
// 따라서 읽으면 자동으로 정렬된 오름차순을 출력한다.
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet();

        // Integer 객체 저장
        scores.add(88);
        scores.add(77);
        scores.add(23);
        scores.add(98);
        scores.add(67);

        // 객체 하나 씩 읽기
        for (Integer s : scores){
            System.out.print(s + "  ");         // 자동으로 오름차순 정렬
        }
        System.out.println();

        // 특정 Integer 객체 가져오기
        System.out.println("가장 높은 점수 : " + scores.last());
        System.out.println("가장 낮은 점수 : " + scores.first());
        System.out.println("85 아래 점수 : " + scores.lower(85));
        System.out.println("85 위 점수 : " + scores.higher(85));
        System.out.println("88 이거나 그 위의 점수 : " + scores.ceiling(88));
        System.out.println("99 이거나 그 아래 점수 : " + scores.floor(99));

        // 내림차순으로 리턴
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores){
            System.out.print(s + "  ");         // 자동으로 내림차순 정렬
        }
        System.out.println();

        // 범위 검색 ( 80 =< )
        NavigableSet<Integer> rangeSet = scores.tailSet(80,true);       // tailSet = ~이상 점수를 가져옴 | true 는 80을 포함하는 지 안하는 지
        for (Integer s : rangeSet){
            System.out.print(s + "  ");
        }
        System.out.println();


        // 범위 검색 (60 =< && < 80)
        rangeSet = scores.subSet(60,true,80,false);
        for (Integer s : rangeSet){
            System.out.print(s + "  ");
        }
        System.out.println();
    }
}
