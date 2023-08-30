package chap_07.Test;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        /*
        main 의 Child child = new Child() 에서 먼저
        public Child()로 이동
        this("홍길동") 전에 자동으로 생성되는 기본 부모 생성자 호출
        Parent()로 이동 this("대한민국")으로
        Parent(String nation)으로 이동. =>  1. "Parent(String nation) call" 출력
        다시 Parent()로 돌아온 후 2. "Parent() call()" 출력
        다시 Child()로 돌아온후 this("홍길동")을 통해
        Child(String name)로 이동 => 3. "Child(String name) call" 출력
        Child()로 돌아온 후 4. "Child() call" 출력
         */
    }
}
