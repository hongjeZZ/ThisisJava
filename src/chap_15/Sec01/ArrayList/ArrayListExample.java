package chap_15.Sec01.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // List 는 ArrayList 의 인터페이스임. list 생성
        List<Board> list = new ArrayList<>();


        // Board 객체 주입
        list.add(new Board("제목1", "내용1", "저자1"));
        list.add(new Board("제목2", "내용2", "저자2"));
        list.add(new Board("제목3", "내용3", "저자3"));
        list.add(new Board("제목4", "내용4", "저자4"));
        list.add(new Board("제목5", "내용5", "저자5"));
        list.add(new Board("제목6", "내용6", "저자6"));


        // 크기 세기
        int length = list.size();
        System.out.println("총 객체 수 : " + length);
        System.out.println();

        // 원하는 객체 추출
        Board board = list.get(3);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());      // getter 를 이용한 출력
        System.out.println();

        // for 문을 이용하여 list 읽기
        for (int i = 0; i < list.size(); i++){
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // remove 를 사용하여 제거, 이때 ArrayList 의 인덱스는 앞으로 당겨와짐
        list.remove(2);
        list.remove(2);

        for (Board board1 : list){
            System.out.println(board1.getSubject() + "\t" + board1.getContent() + "\t" + board1.getWriter());
        }


    }
}
