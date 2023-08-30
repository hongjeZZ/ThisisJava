package chap_03.Sec01.exam02;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String name, String ssn){
        // 생성자 선언
        // 매개변수의 이름은 생성자와 동일하게 주는 게 가독성이 좋다.
        // this 는 현재 객체를 의미한다.
        this.name = name;
        this.ssn = ssn;
    }
}
