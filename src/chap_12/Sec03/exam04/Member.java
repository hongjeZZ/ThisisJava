package chap_12.Sec03.exam04;
// DTO ; 객체 간의 데이터 전달을 위해 다양한 정보가 들어있는 객체
// record 클래스를 사용하여 DTO 객체를 만들 수 있다.
// DTO 의 데이터는 읽기만 가능하도록 private final 을 사용하여 필드를 선언하고, 필드 이름과 동일한 getter 메소드를 가지고 있다.
// 그리고 동등비교를 위해 hashCode(), equals() 메소드를 재정의하고, 문자열 출력을 위해 toString() 또한 재정의 한다.
public record Member(String id, String name, int age) {
}
