package chap_12.Sec06;
// 포장 객체는 기본 타입의 값은 변경할 수 없고, 단지 데이터를 객체로 생성하는데 목적이 있다.
// 이는 컬렉션 객체를 위함이다.

/*
byte        Byte
char        Character
short       Short
int         Integer
long        Long
float       Float
double      Double
boolean     Boolean
 */
public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());        // .intValue(); 는 내부의 int 값을 리턴한다.

        // UnBoxing
        int value = obj;
        System.out.println("value : " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result : " + result);

        // 포장 값 비교
        Integer obj1 = 300;
        Integer obj2 = 300;
        // System.out.println(obj1 == obj2);  불가능; 객체의 번지를 비교하는 것이기 때문에 값을 비교할 수 없음
        System.out.println(obj1.equals(obj2));  // 이게 정답

        // -128 ~ 127 의 범위일 경우
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println(obj3 == obj4);   // 가능; 이 범위의 값에는 객체가 하나만 만들어지기 때문
    }
}
