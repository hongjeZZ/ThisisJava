package chap_13.Sec04;

// 제너릭 메소드를 구현할 때 파라미터를 <T extends Number> 로 정의함으로써 T는 Number 객체와 자식 객체로만 구현이 가능하다.
// 또한 이렇게 구현된 T 객체의 변수들은 Number 객체거나 그 자식 클래스로 Number 의 메소드를 사용할 수 있다.

public class GenericExample {
    public static <T extends Number> boolean compare(T t1,T t2){
        // Number 의 메소드 사용
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args) {
        boolean result1 = compare(10,20);
        System.out.println(result1);
        System.out.println();

        boolean result2 = compare(4.5,4.5);
        System.out.println(result2);
    }
}
