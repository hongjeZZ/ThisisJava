package chap_12.Sec05.exam02;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")                  // 메소드 체이닝 패턴
                .insert(0,"ABC")      // toString(); 을 제외한 다른 메소드는 StringBuilder 를 다시 리턴하기 때문에
                .delete(3,4)                    // 연이어 다른 메소드를 사용해야한다.
                .toString();                    // 최종적으로 이 코드의 값이 저장된다.
        System.out.println(data);
    }
}
