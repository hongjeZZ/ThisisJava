package chap_12.Sec03.exam01;

public class MemberExample {
    public static void main(String[] args) {

        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");

        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));  // equals 재정의 전에는 번지를 비교한다.

        // 모든 클래스는 object 클래스를 상속한다. 그러므로 Member 클래스도 object 의 메소드인 equals 를 사용할 수 있다.

        Member obj3 = new Member("red");

        System.out.println(obj1 == obj3);
        System.out.println(obj1.equals(obj3));

    }
}       /* 정리
           object 이 갖고 있는 equals 는 비교 연산자와 동일하게 번지를 비교한다.
           동등 비교를 하기 위해서는 클래스에서 재정의가 이루어져야 한다.
           */
